package com.bwzk.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import com.bwzk.pojo.FDTable;
import com.bwzk.pojo.SUser;

public class CommonUtil {
	
	/**
	 * 得到登录Lams并且进入相应模块的URL
	 * @param user 用户
	 * @param modName 模块中文名称
	 * @param modOwner 模块所属者 user,  "任务列表", "izerui"
	 */
	public static String generatUrl(SUser user , String modName , String modOwner , String lamsIP){
		StringBuffer sb = new StringBuffer();
		sb.append("http://").append(lamsIP).append("/Lams/autoLogin?card=").append(SeriKeyOper.encrypt(user.getUsercode()));
		sb.append("&serikey=").append(SeriKeyOper.encrypt(user.getPasswd())).append("&moduleName=");
		sb.append(SeriKeyOper.encrypt(modName)).append("&moduleOwner=").append(SeriKeyOper.encrypt(modOwner));
		sb.append("&random=").append(Math.random());
		return sb.toString();
	}
	
	/**
	 * 发送get请求不需要返回参数
	 */
	public static void doHttpGet(String urlString) {
	    try {
	        URL url = new URL(urlString);
	        url.openStream().close();
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
	
	/**
	 * <p>Title: 每次esb发布消息,记录一个整的的消息</p>
	 * <p>Description: </p>
	 * @param xmlDate  要同步的XML数据
	 * @param basePath 文件基础路径 不带文件名
	*/
	public void writeEsbLog(String xmlDate , String basePath){
		try {
			FileUtils.writeStringToFile(new File(basePath), xmlDate);
		} catch (IOException e) {
			log.error("insert Esb log error" , e);
		}
	}
	
	/**
	 * <p>Title:  跟据字段中文名得到fdtable</p>
	 * @param fieldChname 字段中文名称得到fdtable
	 * @date 2014年5月8日
	*/
	public static FDTable getFDtable(List<FDTable> list , String fieldname){
		FDTable fDtable = null;
		for (FDTable ele : list) {
			if(ele.getFieldname().equals(fieldname)){
				fDtable = ele;
				break;
			}
		}
		return fDtable;
	}
	
	/**
	 * 生成guid
	 */
	public static String getGuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	public static void syncActivitUser(String lamsIP){
		String urlStr = "http://"+lamsIP+"/Lams/activiti/syn";
		CommonUtil.doHttpGet(urlStr);
	}
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
