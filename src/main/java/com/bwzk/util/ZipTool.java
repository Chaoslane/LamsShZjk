package com.bwzk.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;
import org.apache.tools.zip.ZipOutputStream;
import org.slf4j.LoggerFactory;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import ch.qos.logback.classic.Logger;

/**
 * <p>Title: ZipTool</p>
 * <p>Description: 文件zip unzip工具</p>
 * @date 2014年6月15日
 */
public class ZipTool {
	/**
	 * 通过zip文件的输入流 解压, 保存到  targetDir 位置 
	 * @param is zip文件的输入流
	 * @param targetDir   保存到  targetDir 位置 
	 */
	public Boolean unZip(InputStream is, String targetDir) throws IOException {
		int len = 0;
		Boolean result = false;
		ZipInputStream zis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		java.util.zip.ZipEntry entry = null;
		byte[] buffer = new byte[GlobalFinalAttr.BUFFER];
		File zipOutFile = chkAndCreate(targetDir);
		if(is != null){
			try {
				zis = new ZipInputStream(new BufferedInputStream(is));
				while ((entry = zis.getNextEntry()) != null) {
					try {
						fos = new FileOutputStream(zipOutFile.getAbsolutePath() + File.separator +  entry.getName());
						bos = new BufferedOutputStream(fos , buffer.length);
						while ((len = zis.read(buffer , 0 , buffer.length)) != -1) {
							bos.write(buffer , 0 , len);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}finally{
						bos.flush();
						bos.close();
						fos.close();
					}
				}
				result = true;
			} catch (Exception e) {
				log.error(e.getMessage() ,  e);
				throw new RuntimeException("解压文件错误:" + e.getMessage());
			} finally {
				zis.close();
			}
		}
		return result;
	}
	
	/**
	 * 通过zipFile文件 解压, 保存到  targetDir 位置 
	 * @param zipFileName zip文件地址
	 * @param targetDir   保存到  targetDir 位置 
	 */
	public Boolean unZip(String zipFileName, String targetDir) throws Exception {
		Boolean result = false;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(zipFileName);
			result = unZip(fis , targetDir);
		} catch (Exception e) {
			log.error(e.getMessage() ,  e);
		}finally{
			fis.close();
		}
		return result;
	}
	
	/**
	 * 将指定的zip文件解压到指定文件夹
	 * @param dir 要压缩的目录
	 * @param zipFileName 压缩后zip文件的路径和名称
	 * @author: www
	 * @throws IOException 
	 * @throws Exception 
	 */
	public Boolean unZipByZipFile(String zipFileName, String extPlace) throws IOException {  
		int len = 0; 
		Boolean result = false;
		ZipFile zf = null;
		InputStream is = null;
		ZipEntry zipEntry = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		byte[] buffer = new byte[GlobalFinalAttr.BUFFER];  
		try {
			File zipFile = new File(zipFileName);
			if(zipFile.exists()){
				zf = new ZipFile(zipFile);
				Enumeration<ZipEntry> entrys = zf.getEntries();
				while (entrys.hasMoreElements()) {
					try {
						zipEntry = entrys.nextElement();
						is = zf.getInputStream(zipEntry);
						fos = new FileOutputStream(extPlace + zipEntry.getName());
						bos = new BufferedOutputStream(fos , buffer.length);
						while ((len = is.read(buffer))  != -1) {  
							bos.write(buffer , 0 , len);
						}  
					} catch (Exception e) {
						log.error(e.getMessage() ,  e);
					}finally{
						bos.flush();
						bos.close();
						fos.close();
					}
				}
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(zf != null){	zf.close();	}
		}
		return result;
	}  

	/**
	 * 把文件压缩为目标文件
	 * @param dir 要压缩的目录
	 * @param zipFileName 压缩后zip文件的路径和名称
	 */
	public Boolean zip(String dir , String targetZipFile) throws Exception{
		int count = 0;
		Boolean result = false;
		ZipOutputStream zipOut = null;
		BufferedInputStream bis = null;
		InputStream is = null;
		File zipFile = new File(targetZipFile);
		byte data[] = new byte[GlobalFinalAttr.BUFFER];
		try {
			File[] fileList = new File(dir).listFiles();
			if(!zipFile.exists()){
				FileUtils.touch(zipFile);
			}
			zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
			for (File file : fileList) {
				if(file.isDirectory()){
					continue;
				}
				is = new FileInputStream(file);
				bis = new BufferedInputStream(is, GlobalFinalAttr.BUFFER);
				ZipEntry entry = new ZipEntry(file.getName());
				zipOut.putNextEntry(entry);
				while ((count = bis.read(data, 0, GlobalFinalAttr.BUFFER)) != -1) {
					zipOut.write(data, 0, count);
				}
				zipOut.flush();
				bis.close();
				is.close();
			}
			result = true;
		} catch (Exception e) {
			log.error(e.getMessage() ,  e);
			throw new Exception("压缩错误");
			
		} finally {
			zipOut.close();
		}
		return result;
	}
	/**
	 * 把文件压缩为目标文件
	 * @param fileList fileLsit
	 * @param zipFileName 压缩后zip文件的路径和名称
	 */
	public Boolean zip(Collection<File> fileList , String zipFilePath) throws Exception{
		int count = 0;
		Boolean flag = false;
		InputStream is = null;
		ZipEntry entry = null;
		ZipOutputStream zipOut = null;
		BufferedInputStream bis = null;
		byte data[] = new byte[GlobalFinalAttr.BUFFER];
		File zipFile = new File(zipFilePath);
		if(!zipFile.exists()){
			FileUtils.touch(zipFile);
		}
		try {
			zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
			for (File file : fileList) {
				try {
					if(file.isDirectory()){
						continue;
					}
					is = new FileInputStream(file);
					bis = new BufferedInputStream(is , GlobalFinalAttr.BUFFER);
					entry = new ZipEntry(file.getName());
					zipOut.putNextEntry(entry);
					while ((count = bis.read(data , 0 , GlobalFinalAttr.BUFFER)) != -1) {
						zipOut.write(data, 0, count);
					}
				} catch (Exception e) {
					log.error(e.getMessage() ,  e);
				}finally{
					zipOut.flush();
					bis.close();
					is.close();
				}
			}
			flag = true;
		} catch (Exception e) {
			throw new Exception("压缩错误");
		} finally {
			zipOut.close();
		}
		return flag;
	}
	
	/**
	 * <p>Title: 将File文件base64.Encode后返回字符串</p>
	 * @param file
	 * @date 2014年6月10日
	*/
	public String encodeFile2Str(File file) throws Exception{
		String str = "";
		byte[] bytes = null;
		FileInputStream fin = null;
		if(file.exists()){
			try {
				fin = new FileInputStream(file);
				bytes = new byte[fin.available()];
				fin.read(bytes);
				str = new BASE64Encoder().encode(bytes);
			} catch (Exception e) {
				str = "";
				log.error(e.getMessage());
				throw new RuntimeException(e);
			}finally{
				fin.close();
				bytes = null;
			}
		}
		return str;
	}
	
	/**
	 * <p>Title: 将字符串decode到指定文件目录 content每次不可以太大</p>
	 * @param content  base64加密的字符串
	 * @param fullPath 要解密的文件位置,绝对文件名
	 * @param isAppand 是否追加文件
	*/
	public File decodeStrAppandFile( String fullPath , String content , Boolean isAppand) throws Exception{
		File file = new File(fullPath);;
		FileOutputStream fout =null;
		try {
			//文件不存在 创建文件
			if(!file.exists()){ 	FileUtils.touch(file);	 }
			fout = new FileOutputStream(file , isAppand);
			byte[] bs = new BASE64Decoder().decodeBuffer(content);
			fout.write(bs);
		} catch (Exception e) {
			log.error(e.getMessage() ,  e);
		}finally{
			fout.flush();
			fout.close();
		}
		return file;
	}
	
	/**
	 * <p> 将字符串先zip压缩然后 base64编码</p>
	*/
	public String zipAndEncode(String source) throws Exception{
		byte[] bytes = zipString2ByteArray(source);
		return new BASE64Encoder().encode(bytes);
	}
	
	/**
	 * <p>Title: 将字符串 先 base64解码 然后 unzip解压</p>
	*/
	public String unzipAndDecode(String source) throws Exception{
		return unZipByteArray2String(new BASE64Decoder().decodeBuffer(source));
	}
	
	/**
	 * 把文件压缩为目标文件
	 * @param dir 要压缩的目录
	 * @param zipFileName 压缩后zip文件的路径和名称
	 * @author: www
	 * @throws Exception 
	 */
	public Boolean zipDir(String dir , String zipFilePath , String[] filter) throws Exception{
		File dirFile = new File(dir);
		Collection<File> fileList = FileUtils.listFiles(dirFile , filter , false);
		return zip(fileList , zipFilePath);
	}
	
	/**
	 * <p>Title: chkAndCreate</p>
	 * <p>Description: 检查目录是否存在 不存在就创建</p>
	 * @param dir
	*/
	public File chkAndCreate(String dir){
		File file = new File(dir);
		if(!file.exists() || !file.isDirectory()){
			file.mkdirs();
		}
		return file;
	}
	
	/**
	 * <p>Title: 将字符串压缩成zip片段,成数组</p>
	 * @throws RuntimeException
	*/
	@Deprecated
	public byte[] zipString2ByteArray(String str) throws Exception{
		byte[] bytes = null;
		ZipOutputStream zout = null;
		ByteArrayOutputStream out = null;
		try {
			out = new ByteArrayOutputStream();
			zout = new ZipOutputStream(out);
			zout.putNextEntry(new ZipEntry("0"));
			zout.write(str.getBytes());
			bytes = out.toByteArray();
		} catch (Exception e) {
			bytes = new byte[0];
			log.error(e.getMessage() ,  e);
		}finally{
			zout.close();
			out.close();
		}
		return bytes;
	}
	
	/**
	 * <p>Title: 将byte数组转换成 String</p>
	*/
	@Deprecated
	public String unZipByteArray2String(byte[] compressed) throws Exception{
		int offset = -1;
		String decompressed = "";
		byte[] buffer = new byte[1024];
		ZipInputStream zin = null;
		ByteArrayInputStream in = null;
		ByteArrayOutputStream out = null;
		try {
			out =  new ByteArrayOutputStream();
			in = new ByteArrayInputStream(compressed);
			zin = new ZipInputStream(in);
			zin.getNextEntry();
			while ((offset = zin.read(buffer)) != -1) {
				out.write(buffer , 0 , offset);
			}
			decompressed = out.toString();
		} catch (Exception e) {
			log.error(e.getMessage() ,  e);
		}finally{
			zin.closeEntry();
			zin.close();
			in.close();
			out.close();
		}
		return decompressed;
	}
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) throws Exception {
		File f  = new  File("c:/maven-metadata-Activiti.zip");
		Integer len = f.getAbsolutePath().length();
		String xmlName = f.getAbsolutePath().substring(0 , len -4)  + ".xml";
		System.out.println(xmlName);
		ZipTool zt = new ZipTool();
		zt.unZip("c:/maven-metadata-Activiti.zip", "c:/");
		// TODO Auto-generated method stub

	}
}
