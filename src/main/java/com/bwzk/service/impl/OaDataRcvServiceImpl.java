package com.bwzk.service.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

import com.bwzk.pojo.FDTable;
import com.bwzk.service.BaseService;
import com.bwzk.service.i.OaDataRcvService;
import com.bwzk.util.CommonUtil;
import com.bwzk.util.GlobalFinalAttr;

@Service("oaDataRcvService")
public class OaDataRcvServiceImpl extends BaseService implements
		OaDataRcvService {

	@Override
	public void dataReceive() {
		String dmbSql = "select * from " + dmb + "";
		Map<String, Object> map = jdbcDao.queryForMap(dmbSql);
		String dfileSwMapping = map.get("F1").toString();
		String dfileFwMapping = map.get("F2").toString();
//		String tmDfileSwMapping = map.get("F3").toString();
//		String tmDfileFwMapping = map.get("F4").toString();
		String qzMapping = map.get("F5").toString();
		String defaultValue = map.get("F6").toString();
		String dfileSql = map.get("F7").toString();
		String efileSql = map.get("F8").toString();
		Integer maxdid = -1;
		String libcode = null;
		String qzh = null;
		String oaid = null;
		String tableName = null;
		String dfileMapping = null;
		FDTable fDtable = null;
		List<FDTable> fDTableList = null;// 相关档案类型的字段List
		List<Map<String, Object>> dataList = oaJdbcDao.quertListMap(dfileSql);
		StringBuffer fields = new StringBuffer();
		StringBuffer values = new StringBuffer();
		for (Map<String, Object> dataMap : dataList) {
			if (dataMap.size() > 0 && dataMap != null) {
				String dwmc = dataMap.get("DW").toString();
				String wjlx = dataMap.get("WJLX").toString();
				qzh = getQzh4Qzmc(dwmc, qzMapping);
				oaid = dataMap.get("DID").toString();
				libcode = wsCode;
				tableName = "d_file" + wsCode + "";
				try {
					if (wjlx.equals(oaWjbs)) {
						dfileMapping = dfileSwMapping;
					} else {
						dfileMapping = dfileFwMapping;
					}
					maxdid = getMaxDid(tableName);
					fDTableList = sGroupMapper.getFtableList("F_" + tableName);
					for (String OAData : dataMap.keySet()) {

						String codeSql = "select f2 from " + dfileMapping
								+ " where f1 = '" + OAData + "'";
						String DaData = jdbcDao.query4String(codeSql);
						if (StringUtils.isNotEmpty(DaData)) {
							String OAValue = (dataMap.get(OAData) == null ? ""
									: dataMap.get(OAData).toString());
							OAValue = (OAValue.contains("'") ? OAValue.replace(
									"'", "''") : OAValue);
							fields.append(DaData).append(",");
							fDtable = CommonUtil
									.getFDtable(fDTableList, DaData);
							switch (fDtable.getFieldtype()) {
							case 11:
								if (OAValue.equals("")) {
									values.append("sysdate,");
								} else {
									values.append(generateTimeToSQLDate(OAData))
											.append(",");
								}
								break;
							case 1:
								values.append("'").append(OAValue).append("',");
								break;
							case 3:
								if (StringUtils.isBlank(OAValue)) {
									values.append("null ,");
								} else {
									values.append(Integer.parseInt(OAValue))
											.append(",");
								}
								break;
							default:
								values.append("'").append(OAValue).append("',");
								break;
							}
						}
					}
					JSONObject readobj = JSONObject.fromObject(defaultValue);
					Iterator<String> itt = readobj.keys();
					while (itt.hasNext()) {

						String key = itt.next().toString();
						Integer value = readobj.getString(key) == null ? null
								: Integer.parseInt(readobj.getString(key)
										.toString());
						fields.append(key).append(",");
						values.append(value).append(",");
					}
					fields.append("pid,createtime,qzh,did ");
					values.append("-1,getdate(),'");
					values.append(qzh).append("',").append(maxdid);

					String InsertSql = "insert into " + tableName + "" + " ("
							+ fields.toString() + ") values ( "
							+ values.toString() + " )";
					System.out.println("============");
					System.out.println(InsertSql);
					execSql(InsertSql);
					String updateSql = "update " + oaDfile
							+ " set zhbs = 1 where did = '" + oaid + "'";
					oaJdbcDao.excute(updateSql);
					fields.setLength(0);
					values.setLength(0);
					log.error("插入一条数据成功.fileReciveTxt: " + InsertSql);
					insertEfile(oaid, efileSql, libcode, maxdid);
				} catch (Exception e) {
					e.printStackTrace();
					log.error("插入一条数据失败.fileReciveTxt: " + e.getMessage());
					break;
				}
			}
		}
	}

	/**
	 * 电子文件集成
	 */
	private void insertEfile(String oaid, String efileSql, String libcode,
			Integer pid) {
		Integer maxDid = -1;
		String tableName = "e_file" + libcode + "";
		StringBuffer fields = new StringBuffer();
		StringBuffer values = new StringBuffer();
		String sql = efileSql + " where pid = '" + oaid + "'";
		List<Map<String, Object>> listMap = oaJdbcDao.quertListMap(sql);
		for (Map<String, Object> valueMap : listMap) {
			try {
				Set<String> keySet = valueMap.keySet();
				for (String key : keySet) {
					Object theValue = valueMap.get(key);
					if (theValue != null) {
						fields.append(key).append(",");
						if (theValue instanceof Timestamp) {
							values.append(
									GlobalFinalAttr.DatabaseType.SQLSERVER
											.generateTimeToSQLDate(theValue))
									.append(",");
						} else if (theValue instanceof Integer) {
							values.append(theValue).append(",");
						} else {
							values.append("'").append(theValue).append("'")
									.append(",");
						}
					}
				}
				maxDid = getMaxDid(tableName);
				fields.append("DID").append(",").append("PID");
				values.append(maxDid).append(",").append(pid);
				String insertSql = "insert into " + tableName + "" + " ("
						+ fields.toString() + ") values ( " + values.toString()
						+ " )";
				System.out.println(insertSql.toString());
				jdbcDao.insert(insertSql.toString());
				String upSql = "update d_file" + libcode
						+ " set attached = 1 where did = " + pid + "";
				execSql(upSql);
				fields.setLength(0);
				values.setLength(0);
				log.error("插入一条数据成功.fileReciveTxt: " + insertSql);
			} catch (Exception e) {
				log.error("插入一条数据失败.fileReciveTxt: " + e.getMessage());
				break;
			}
		}
	}

	/**
	 * 通过全宗名称获取全宗号
	 * 
	 * @return
	 */
	private String getQzh4Qzmc(String qzmc, String qzb) {
		String qzh = null;
		if (StringUtils.isNotBlank(qzmc)) {
			String sql = "select f1 from " + qzb + " where f2 = '" + qzmc + "'";
			qzh = jdbcDao.query4String(sql);
		}
		return qzh;
	}

	String singleQuotes(String param) {
		return param.replace("'", "''");
	}

	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

}
