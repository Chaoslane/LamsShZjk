package com.bwzk.pojo;
// default package

import java.io.File;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class EFile implements java.io.Serializable {
	private static final long serialVersionUID = -4633677822610132400L;
	private Integer did;
	private Integer pid;
	private String efilename;
	private String title;
	private String ext = "";
	private String pzm;
	private String pathname;
	private String efiledb;
	private Integer efileid;
	private String xlh;
	private String bbh;
	private String swt;
	private Integer status;
	private Integer attr;
	private Integer attrex;
	private String creator;
	private Date createtime;
	private String editor;
	private Date edittime;
	private String deltor;
	private Date deltime;
	private String bz;
	private Integer pxno;
	private String tablename;
	private String md5;
	private Integer filesize = 0;

	// Constructors

	/** default constructor */
	public EFile() {
	}

	/** minimal constructor */
	public EFile(Integer did, Integer status, Integer attr, Integer attrex) {
		this.did = did;
		this.status = status;
		this.attr = attr;
		this.attrex = attrex;
	}


	// Property accessors

	public Integer getFilesize() {
		return filesize;
	}

	public void setFilesize(Integer filesize) {
		this.filesize = filesize;
	}
	
	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getEfilename() {
		return this.efilename;
	}

	public void setEfilename(String efilename) {
		this.efilename = efilename;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExt() {
		return this.ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getPzm() {
		return this.pzm;
	}

	public void setPzm(String pzm) {
		this.pzm = pzm;
	}

	public String getPathname() {
		if(StringUtils.isNotEmpty(pathname)&&(!this.pathname.startsWith(File.separator) && !this.pathname.endsWith(File.separator))){
			return File.separator + this.pathname + File.separator;
		}
		return this.pathname;
	}

	public void setPathname(String pathname) {
		this.pathname = pathname;
	}

	public String getEfiledb() {
		return this.efiledb;
	}

	public void setEfiledb(String efiledb) {
		this.efiledb = efiledb;
	}

	public Integer getEfileid() {
		return this.efileid;
	}

	public void setEfileid(Integer efileid) {
		this.efileid = efileid;
	}

	public String getXlh() {
		return this.xlh;
	}

	public void setXlh(String xlh) {
		this.xlh = xlh;
	}

	public String getBbh() {
		return this.bbh;
	}

	public void setBbh(String bbh) {
		this.bbh = bbh;
	}

	public String getSwt() {
		return this.swt;
	}

	public void setSwt(String swt) {
		this.swt = swt;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAttr() {
		return this.attr;
	}

	public void setAttr(Integer attr) {
		this.attr = attr;
	}

	public Integer getAttrex() {
		return this.attrex;
	}

	public void setAttrex(Integer attrex) {
		this.attrex = attrex;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getEditor() {
		return this.editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Date getEdittime() {
		return this.edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	public String getDeltor() {
		return this.deltor;
	}

	public void setDeltor(String deltor) {
		this.deltor = deltor;
	}

	public Date getDeltime() {
		return this.deltime;
	}

	public void setDeltime(Date deltime) {
		this.deltime = deltime;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public Integer getPxno() {
		return this.pxno;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public void setPxno(Integer pxno) {
		this.pxno = pxno;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}


}