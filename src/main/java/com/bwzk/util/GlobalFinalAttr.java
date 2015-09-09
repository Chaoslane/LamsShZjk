package com.bwzk.util;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/**
 * @author: www
 * @Function: 全局常量区
 */
public class GlobalFinalAttr implements Serializable {
	
	/** 工程编码 UTF-8 */
	public static final String PRJ_CHAR_CODE = "UTF-8";
	/** txt参数传入的分隔符 */
	public static final String SEPARATOR = "&;";
	//读取文件buffer大小
	public static final int BUFFER = 2*1024;
	/**
	 * 得到系统WEB-INF/classes路径
	 */
	public static final String BASE_PATH_WEBINF = GlobalFinalAttr.class.getClassLoader().getResource("/").getFile();
	/**
	 * xml地址
	 */
	public static final String XML_PATH = GlobalFinalAttr.class.getClassLoader().getResource("/").getFile()+"XML"+"/";
//	public static final String XML_PATH = "C:/XML/";
	private GlobalFinalAttr() { }
	private static final long serialVersionUID = -1055286768481978085L;
	/**
	 * 通过表名得到libcode
	 */
	public static Integer getLibCodeByTableName(String tableName) {
		String tempLibcode = null;
		String tempTableName = tableName.toUpperCase();
		if (tempTableName.contains("D_PRJ")) {
			tempLibcode = tempTableName.replace("D_PRJ", "");
		} else if (tempTableName.contains("D_VOL")) {
			tempLibcode = tempTableName.replace("D_VOL", "");
		} else if (tempTableName.contains("D_FILE")) {
			tempLibcode = tempTableName.replace("D_FILE", "");
		} else if (tempTableName.contains("E_FILE")) {
			tempLibcode = tempTableName.replace("E_FILE", "");
		} else if (tempTableName.contains("X_D_PRJ")) {
			tempLibcode = tempTableName.replace("X_D_PRJ", "");
		} else if (tableName.contains("X_D_VOL")) {
			tempLibcode = tempTableName.replace("X_D_VOL", "");
		} else if (tableName.contains("X_D_FILE")) {
			tempLibcode = tempTableName.replace("X_D_FILE", "");
		} else if (tableName.contains("W_QT")) {
			tempLibcode = tempTableName.replace("W_QT", "");
		} else if (tableName.contains("E_FILEQT")) {
			tempLibcode = tempTableName.replace("E_FILEQT", "");
		} else if (tableName.contains("T_ZTK")) {
			tempLibcode = tempTableName.replace("T_ZTK", "");
		} else if (tableName.contains("INDEX_")) {
			tempLibcode = tempTableName.replace("INDEX_", "");
		}else if (tableName.contains("D_CLASSIFY")) {
			tempLibcode = tempTableName.replace("D_CLASSIFY", "");
		}
		try {
			return Integer.parseInt(tempLibcode);
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * 通过int值得到相应的枚举类型
	 * @return EOperLevelType
	 */
	public static EOperLevelType getLevelByInt(Integer level) {
		switch (level) {
		case 0:
			return EOperLevelType.D_PRJ_LEVEL;
		case 1:
			return EOperLevelType.D_VOL_LEVEL;
		case 2:
			return EOperLevelType.D_FILE_LEVEL;
		case 3:
			return EOperLevelType.E_EFILE_LEVEL;
		case 4:
			return EOperLevelType.W_QT_LEVEL;
		case 5:
			return EOperLevelType.E_FILEQT_LEVEL;
		case 10:
			return EOperLevelType.X_D_PRJ_LEVEL;
		case 11:
			return EOperLevelType.X_D_VOL_LEVEL;
		case 12:
			return EOperLevelType.X_D_FILE_LEVEL;
		case 20:
			return EOperLevelType.T_ZTK_LEVEL;
		case 30:
			return EOperLevelType.INDEX_;
		case 40:
			return EOperLevelType.D_CLASSIFY;
		default:
			return EOperLevelType.D_FILE_LEVEL;
		}
	}
	
	/**
	 * 根据D_PRJ 或者 D_FIEL字符串得到枚举类型
	 */
	public static EOperLevelType getLevelByStr(String classDB) {
		if (classDB.equalsIgnoreCase("D_PRJ")) {
			return EOperLevelType.D_PRJ_LEVEL;
		} else if (classDB.equalsIgnoreCase("D_VOL")) {
			return EOperLevelType.D_VOL_LEVEL;
		} else if (classDB.equalsIgnoreCase("D_FILE")) {
			return EOperLevelType.D_FILE_LEVEL;
		} else if (classDB.equalsIgnoreCase("E_FILE")) {
			return EOperLevelType.E_EFILE_LEVEL;
		} else if (classDB.equalsIgnoreCase("X_D_PRJ")) {
			return EOperLevelType.X_D_PRJ_LEVEL;
		} else if (classDB.equalsIgnoreCase("X_D_VOL")) {
			return EOperLevelType.X_D_VOL_LEVEL;
		} else if (classDB.equalsIgnoreCase("X_D_FILE")) {
			return EOperLevelType.X_D_FILE_LEVEL;
		} else if (classDB.equalsIgnoreCase("W_QT")) {
			return EOperLevelType.W_QT_LEVEL;
		} else if (classDB.equalsIgnoreCase("INDEX_")) {
			return EOperLevelType.INDEX_;
		}else if (classDB.equalsIgnoreCase("D_CLASSIFY")) {
			return EOperLevelType.D_CLASSIFY;
		}
		return null;
	}

	/**
	 * 根据表名得到级别
	 */
	public static EOperLevelType getLevelByTableName(String tableName) {
		String tempTableName = tableName.toUpperCase();
		if (tempTableName.contains("D_PRJ")) {
			return EOperLevelType.D_PRJ_LEVEL;
		} else if (tempTableName.contains("D_VOL")) {
			return EOperLevelType.D_VOL_LEVEL;
		} else if (tempTableName.contains("D_FILE")) {
			return EOperLevelType.D_FILE_LEVEL;
		} else if (tempTableName.contains("E_FILE")) {
			return EOperLevelType.E_EFILE_LEVEL;
		} else if (tempTableName.contains("W_QT")) {
			return EOperLevelType.W_QT_LEVEL;
		} else if (tempTableName.contains("E_FILEQT")) {
			return EOperLevelType.E_FILEQT_LEVEL;
		} else if (tempTableName.contains("X_D_PRJ")) {
			return EOperLevelType.X_D_PRJ_LEVEL;
		} else if (tempTableName.contains("X_D_VOL")) {
			return EOperLevelType.X_D_VOL_LEVEL;
		} else if (tempTableName.contains("X_D_FILE")) {
			return EOperLevelType.X_D_FILE_LEVEL;
		} else if (tempTableName.contains("INDEX_")) {
			return EOperLevelType.INDEX_;
		} else if (tempTableName.contains("W_QT")){
			return EOperLevelType.W_QT_LEVEL;
		} else if (tempTableName.contains("D_CLASSIFY")){
			return EOperLevelType.D_CLASSIFY;
		}else{
			return EOperLevelType.D_PRJ_LEVEL;
		}
	}
	
	/**
	 * 通过表名得到级别中文
	 */
	public static String getLevelZhNameByTableName(String tableName) {
		String tempTableName = tableName.toUpperCase();
		if (tempTableName.contains("D_PRJ")) {
			return "项目";
		} else if (tempTableName.contains("D_VOL")) {
			return "案卷";
		} else if (tempTableName.contains("D_FILE")) {
			return "文件";
		} else if (tempTableName.contains("E_FILE")) {
			return "电子原文";
		} else if (tempTableName.contains("W_QT")) {
			return "收发文";
		} else if (tempTableName.contains("E_FILEQT")) {
			return "文件库电子原文库";
		} else if (tempTableName.contains("X_D_PRJ")) {
			return "鉴定销毁项目";
		} else if (tempTableName.contains("X_D_VOL")) {
			return "鉴定销毁案卷";
		} else if (tempTableName.contains("X_D_FILE")) {
			return "鉴定销毁文件";
		} else if (tempTableName.contains("INDEX_")) {
			return "索引";
		}else{
			return "文件";
		}
	}

	/**
	 * 通过传入枚举型的操作范围和libocde的到表名
	 */
	public static String getTableNameByParam(Integer libcode , EOperLevelType level) {
		return level.getValueStr() + libcode;
	}

	/**
	 * 获取档案表
	 */
	public static String getTableNameByParam(Integer libcode, Integer level) {
		return GlobalFinalAttr.getLevelByInt(level).getValueStr() + libcode;
	}

	/**
	 * 获取销毁表
	 */
	public static String getXTableNameByParam(Integer libCode, Integer level) {
		return "X_" + GlobalFinalAttr.getLevelByInt(level).getValueStr() + libCode;
	}

	/**
	 * 枚举类.数据访问范围级别 0 . 项目级别(0) 1 . 案卷级别(1) 2 . 文件级别(2) 3 . 电子原文级别(3) 4 . 文件库(4)
	 * 10. 鉴定销毁项目库(10) 11. 鉴定销毁案卷库(11) 12. 鉴定销毁文件库(12) 20. 专题 30. 全文检索索引表
	 */
	public enum EOperLevelType {
		/**
		 * 项目级别(0)
		 */
		D_PRJ_LEVEL(0),
		/**
		 * 案卷级别(1)
		 */
		D_VOL_LEVEL(1),
		/**
		 * 文件级别(2)
		 */
		D_FILE_LEVEL(2),
		/**
		 * 电子原文级别(3)
		 */
		E_EFILE_LEVEL(3),
		/**
		 * 文件库级别(4)
		 */
		W_QT_LEVEL(4),
		/**
		 * 文件库电子原文库(5)
		 */
		E_FILEQT_LEVEL(5),
		/**
		 * 鉴定销毁项目(10)
		 */
		X_D_PRJ_LEVEL(10),
		/**
		 * 鉴定销毁案卷(11)
		 */
		X_D_VOL_LEVEL(11),
		/**
		 * 鉴定销毁文件(12)
		 */
		X_D_FILE_LEVEL(12),
		/**
		 * 专题库 (20)
		 */
		T_ZTK_LEVEL(20),
		/**
		 * 索引 (30)
		 */
		INDEX_(30),
		/**
		 * 分类 (40)
		 */
		D_CLASSIFY(40);

		EOperLevelType(Integer value) {
			this.value = value;
		}

		private Integer value;

		public Integer getValue() {
			return value;
		}

		/**
		 * @return D_FILE or D_PRJ or D_VOL or E_FILE or W_QT or X_
		 */
		public String getValueStr() {
			switch (value) {
			case 0:
				return "D_PRJ";
			case 1:
				return "D_VOL";
			case 2:
				return "D_FILE";
			case 3:
				return "E_FILE";
			case 4:
				return "W_QT";
			case 5:
				return "E_FILEQT";
			case 10:
				return "X_D_PRJ_LEVEL";
			case 11:
				return "X_D_VOL_LEVEL";
			case 12:
				return "X_D_FILE_LEVEL";
			case 20:
				return "T_ZTK";
			case 30:
				return "INDEX_";
			case 40:
				return "D_CLASSIFY";
			}
			return null;
		}

		public String getChValueStr() {
			switch (value) {
			case 0:
				return "项目";
			case 1:
				return "案卷";
			case 2:
				return "文件";
			case 3:
				return "电子文件";
			case 4:
				return "收集";
			case 5:
				return "收集库文件";
			case 10:
				return "项目-销毁";
			case 11:
				return "案卷-销毁";
			case 12:
				return "文件-销毁";
			case 20:
				return "专题";
			case 30:
				return "全文索引";
			case 40:
				return "分类";
			}
			return null;
		}
	}

	/**
	 * 枚举类.归档前后 0 . 归档后(0) 1 .归档前(1)
	 */
	public enum EGuiDangQH {

		/**
		 * 归档后(0)
		 */
		E_GUIDANG_AFTER(0),
		/**
		 * 归档前(1)
		 */
		E_GUIDANG_BEFORE(1);

		EGuiDangQH(Integer value) {
			this.value = value;
		}

		private Integer value;

		public Integer getValue() {
			return value;
		}

		public static EGuiDangQH getAttrByStr(int attr) {
			switch (attr) {
			case 0:
				return EGuiDangQH.E_GUIDANG_AFTER;
			case 1:
				return EGuiDangQH.E_GUIDANG_BEFORE;
			default:
				return EGuiDangQH.E_GUIDANG_AFTER;
			}
		}
	}

	/**
	 * 特殊字符的分隔符
	 */
	public static final String FGF_SPECL = "‖";
	/**
	 * 正则表达式分隔符
	 */
	public static final String ZZ_EXPRESSION = "[, .:， 。：，　．：，　。：‖]";

	public static final String PRJ_CHNAME = "项目";
	public static final String VOL_CHNAME = "案卷";
	public static final String FILE_CHNAME = "文件";

 	/**
	 * 生成guid 不包含 -
	 */
	public static String getGuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 数据库类型枚举
	 * @author izerui
	 *
	 */
	public enum DatabaseType{
		ORACLE(0),SQLSERVER(1),MYSQL(2),DB2(3),H2(4);
		
		private int value;
		public final static String databaseProductName = "databaseProductName";
		public final static String databaseTypeToLowerCase = "databaseTypeToLowerCase";
		public final static String sysdatetype = "sysdatetype";
		public final static String fieldtype_varchar = "fieldtype_varchar";
		public final static String fieldtype_int = "fieldtype_int";
		public final static String fieldtype_date = "fieldtype_date";
		public final static String fieldtype_blob = "fieldtype_blob";
		public final static String fieldtype_float = "fieldtype_float";
		
		public int getValue() {
			return value;
		}
		DatabaseType(int value) {
			this.value = value;
		}
		/**
		 * <li> databaseProductName  数据库类型串 例： Oracle | Microsoft SQL Server
		 * <li> databaseTypeToLowerCase 数据库小写类型 例： oracle | mssql
		 * <li> sysdatetype 数据库时间串 例: SYSDATE | GETDATE()
		 * <li> fieldtype_int 整数字段类型
		 * <li> fieldtype_date 日期字段类型
		 * <li> fieldtype_blob 大字段字段类型
		 * <li> fieldtype_float 浮点字段类型
		 * @return
		 */
		public String getDatabaseAttribute(String property) {
			Map<String,String> map = new HashMap<String, String>();
			map.put(fieldtype_varchar, "varchar");
			map.put(fieldtype_varchar, "float");
			switch (value) {
			case 0:
				map.put(databaseProductName, "Oracle");
				map.put(databaseTypeToLowerCase, "oracle");
				map.put(sysdatetype, "SYSDATE");
				map.put(fieldtype_int, "number");
				map.put(fieldtype_date, "TIMESTAMP");
				map.put(fieldtype_blob, "blob");
				break;
			case 1:
				map.put(databaseProductName, "Microsoft SQL Server");
				map.put(databaseTypeToLowerCase, "mssql");
				map.put(sysdatetype, "GETDATE()");
				map.put(fieldtype_int, "int");
				map.put(fieldtype_date, "datetime");
				map.put(fieldtype_blob, "image");
				break;
			case 2:
				map.put(databaseProductName, "MySQL");
				map.put(databaseTypeToLowerCase, "mysql");
				map.put(sysdatetype, "NOW()");
				map.put(fieldtype_int, "int");
				map.put(fieldtype_date, "timestamp");
				map.put(fieldtype_blob, "LONGBLOB");
				break;
			case 3:
				map.put(databaseProductName, "Db2");
				map.put(databaseTypeToLowerCase, "db2");
				map.put(sysdatetype, "CURRENT TIMESTAMP");
				map.put(fieldtype_int, "int");
				map.put(fieldtype_date, "TIMESTAMP");
				map.put(fieldtype_blob, "blob");
				break;
			case 4:
				map.put(databaseProductName, "H2");
				map.put(databaseTypeToLowerCase, "h2");
				map.put(sysdatetype, "current_timestamp");
				map.put(fieldtype_int, "int");
				map.put(fieldtype_date, "timestamp");
				map.put(fieldtype_blob, "blob");
				break;
			}
			return map.get(property);
		}
		
		public String getInstrFunction(String field,String fieldvalue){
			String sql = null;
			switch (value) {
			case 0:
				sql = "INSTR('"+fieldvalue+"',"+field+")";
				break;
			case 1:
				sql = "CHARINDEX("+field+" , '"+fieldvalue+"')";
				break;
			case 2:
				sql = "INSTR( '"+fieldvalue+"' ,"+field+")";
				break;
			case 3:
				sql = "Locate( '"+fieldvalue+"' ,"+field+")";
				break;
			case 4:
				sql = "INSTR( "+field+",'"+fieldvalue+"')";
				break;
			}
			return sql;
		}
		
		public String castFieldToNumber(String field){
			switch (value) {
			case 0:
				field = "to_number("+field+")";
				break;
			case 1:
				field = "cast("+field+" as int)";
				break;
			case 2:
				field = "cast("+field+" as signed)";
				break;
			case 3:
				field = "int("+field+")";
				break;
			case 4:
				field = "cast("+field+" as int)";
				break;
			}
			return field;
		}
		
		public String getModifyKey(){
			String modifyStr = "MODIFY";
			switch (value) {
			case 0:
				modifyStr = "MODIFY";
				break;
			case 1:
				modifyStr = "ALTER COLUMN";
				break;
			case 2:
				modifyStr = "CHANGE";
				break;
			case 3:
				modifyStr = "ALTER";//忽略暂时不对
				break;
			case 4:
				modifyStr = "MODIFY";//忽略暂时不对
				break;
			}
			return modifyStr;
		}
		
		public String generateTimeToSQLDate(Object date){
			TimeZone.setDefault(TimeZone.getTimeZone("ETC/GMT-8"));  //设置时区 中国/北京/香港
			String datevalue = null;
			if(date instanceof Date){
				datevalue = DateUtil.getDateTimeFormat().format(date);
			}
			if(date instanceof String){
				datevalue = (String)date;
			}
			switch (value) {
			case 0:
				if(datevalue.indexOf(".")>-1){//防止出现 2056-12-25 00:00:00.0 而无法导入
					datevalue = datevalue.substring(0, datevalue.lastIndexOf("."));
				}
				datevalue = "TO_DATE('"+datevalue+"', 'yyyy-MM-dd HH24:mi:ss')";
				break;
			case 1:
				datevalue = "cast('" + datevalue + "' as datetime)";
				break;
			case 2:
				datevalue =  "DATE_FORMAT('"+datevalue+"', '%Y-%m-%d %H:%i:%s')";
				break;
			case 3:
				datevalue = "TIMESTAMP('" + datevalue + "' )";
				break;
			case 4:
				datevalue = "PARSEDATETIME('" + datevalue + "'，'dd-MM-yyyy hh:mm:ss.SS' )";
				break;
			}
			return datevalue;
		}
		
		/**
		 * 获取数据库enddate字段的日期是否早于当前时间
		 * @return
		 */
		public String generateGuoQiSQL(){
			String dbTime = null;
			switch (value) {
			case 0:
				// SYSDATE - ENDDATE返回的是天数，不足一天是小数，用CEIL转成1
				dbTime = "CEIL(SYSDATE - ENDDATE) > 1";
				break;
			case 1:
				dbTime = "DATEDIFF([day], GETDATE(), ENDDATE) < 0";
				break;
			case 2:
				dbTime = "To_Days(current_date) - To_Days(ENDDATE) > 0";
				break;
			case 3:
				dbTime = "DAYS(CURRENT TIMESTAMP) - DAYS(ENDDATE) > 0";
				break;
			case 4:
				dbTime = "CEIL(CURRENT_TIMESTAMP - ENDDATE) > 1";
				break;
			}
			return dbTime;
		}
		
		public static DatabaseType getDatabaseType(String databaseProductName){
			if(databaseProductName.equals("Oracle")){
				return ORACLE;
			}else if(databaseProductName.equals("Microsoft SQL Server")){
				return SQLSERVER;
			}else if(databaseProductName.equals("MySQL")){
				return MYSQL;
			}else if(databaseProductName.equals("Db2")){
				return DB2;
			}else if(databaseProductName.equals("H2")){
				return H2;
			}
			return ORACLE;
		}
		
	}
	
}
