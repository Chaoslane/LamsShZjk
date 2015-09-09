package com.bwzk.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

import com.bwzk.dao.i.SGroupMapper;
import com.bwzk.pojo.FDTable;
import com.bwzk.pojo.SDalx;
import com.bwzk.pojo.WWjkgl;
import com.bwzk.pojo.jaxb.Field;
import com.bwzk.pojo.jaxb.Table;

@Component("createXmlUtil")
public class XmlUtil {
	
	/**
	 * 调用生成xml
	 */
	public void generatorXml() throws IOException {
		List<SDalx> dalxList = sGroupMapper.getAllDalxList();
		for (SDalx dalx : dalxList) {
			if(dalx.getStatus() == 0){
				if (dalx.getHasprj() == 1) {
					generatorXmlByTableName("D_PRJ" + dalx.getCode(),  dalx.getChname() + "-项目");
				}
				if (dalx.getHasvol() == 1) {
					generatorXmlByTableName("D_VOL" + dalx.getCode(),  dalx.getChname() + "-案卷");
				}
				generatorXmlByTableName("D_FILE" + dalx.getCode(),  dalx.getChname() + "-文件");
				generatorXmlByTableName("E_FILE" + dalx.getCode(),  dalx.getChname() + "-电子文件");
			}
		}
		List<WWjkgl> wjkglList = sGroupMapper.getAllWjkglList();
		for (WWjkgl wjkgl : wjkglList) {
			generatorXmlByTableName("W_QT" + wjkgl.getDid() ,  wjkgl.getWjkmc() + "-库");
			generatorXmlByTableName("E_FILEQT" + wjkgl.getDid() ,  wjkgl.getWjkmc() + "-电子文件库");
		}
		generatorXmlByTableName("S_USER",  "用户表");
		generatorXmlByTableName("S_GROUP",  "部门表");
		generatorXmlByTableName("S_QZH",  "全宗表");
	}
	
	public Table getTable(String xmlclasspath) {
		xmlclasspath = GlobalFinalAttr.BASE_PATH_WEBINF + xmlclasspath;
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Table.class);
			Unmarshaller unmarshal = context.createUnmarshaller();
			FileReader reader = new FileReader(xmlclasspath);
			Table table = (Table) unmarshal.unmarshal(reader);
			return table;
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void generatorXmlByTableName(String tableName, String chName) throws IOException {
		File folder = new File(GlobalFinalAttr.XML_PATH);
		if(!folder.exists()){
			folder.mkdir();
		}
		File targetFile = new File(GlobalFinalAttr.XML_PATH + tableName + ".XML");
		if (targetFile.exists()) {
			return;
		}else{
			targetFile.createNewFile();
		}
		OutputStreamWriter writer = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Table.class);
			Table table = new Table();
			table.setName(tableName);
			table.setFname("F_" + tableName);
			table.setChname(chName);
			List<Field> fields = new ArrayList<Field>();
			
			List<FDTable> fdtableList = sGroupMapper.getFtableList("F_"+tableName);
			for (FDTable tt : fdtableList) {
				if(tableName.equals("S_USER") || tableName.equals("S_GROUP")){
					if(isIgnores(tt.getFieldname().toUpperCase())){
						continue;
					}
				}else{
					if(isIgnore(tt.getFieldname().toUpperCase())){
						continue;
					}
				}
				Field field = new Field();
				field.setChname(tt.getChname());
				field.setFieldname(tt.getFieldname());
				field.setFieldtype(tt.getFieldtype());
				field.setLength(tt.getLength());
				field.setNotnull(tt.getNotnull()==1);
				if(tt.getFieldtype().equals(3)){
					field.setThevalue("1");
				}else if(tt.getFieldtype().equals(11)){
					field.setThevalue("1986-06-19 hh:mm:ss.S");
				}else{
					field.setThevalue("just a string");
				}
				fields.add(field);
			}
			table.setFields(fields);
			Marshaller marshal = context.createMarshaller();
			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//marshal输出默认是UTF-8 所以这里需要指定 writer 是UTF-8的输出
			writer = new OutputStreamWriter(new FileOutputStream(targetFile),"UTF-8");
			marshal.marshal(table, writer);
		} catch (Exception e) {
			log.error(e.getMessage() , e);
		}finally{
			writer.close();
		}
	}
	
	/**
	 * <p>Title: 传入字段的英文名称 如果是忽略列表返回ture </p>
	*/
	private Boolean isIgnore(String fieldName){
		Boolean isIgnore = false;
		for (String ig : IGNORE_FIELD_NAME) {
			if(ig.equals(fieldName)){
				isIgnore = true;
				break;
			}
		}
		return isIgnore;
	}
	/**
	 * <p>Title: 传入字段的英文名称 如果是忽略列表返回ture </p>
	 */
	private Boolean isIgnores(String fieldName){
		Boolean isIgnore = false;
		for (String ig : IGNORE_FIELD_NAMES) {
			if(ig.equals(fieldName)){
				isIgnore = true;
				break;
			}
		}
		return isIgnore;
	}
	@Autowired
	private SGroupMapper sGroupMapper;

	/** 忽略不需要的字段 */
	private String[] IGNORE_FIELD_NAME = {"EFILEID","XLH","BBH","SWT","BBH","STATUS","ATTR","ATTREX"
			,"CREATOR","CREATETIME","EDITOR","EDITTIME","DELTOR","DELTIME","DHYY","DID" , "RECEIVER"
			, "QZH", "BMID"};
	/** 忽略不需要的字段 */
	private String[] IGNORE_FIELD_NAMES = {"DID" , "QZH", "PID"};
	
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
