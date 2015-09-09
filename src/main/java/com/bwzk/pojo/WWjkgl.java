package com.bwzk.pojo;

/**
 * WWjkgl entity.
 * 文件库管理信息表
 * @author MyEclipse Persistence Tools
 */

public class WWjkgl implements java.io.Serializable {

	// Fields

	private Integer did;
	private Integer qzid;
	private Integer tbltype;
	private String wjkmc;
	private String bz;

	// Constructors

	/** default constructor */
	public WWjkgl() {
	}

	/** full constructor */
	public WWjkgl(Integer qzid, Integer tbltype, String wjkmc, String bz) {
		this.qzid = qzid;
		this.tbltype = tbltype;
		this.wjkmc = wjkmc;
		this.bz = bz;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Integer getQzid() {
		return this.qzid;
	}

	public void setQzid(Integer qzid) {
		this.qzid = qzid;
	}

	public Integer getTbltype() {
		return this.tbltype;
	}

	public void setTbltype(Integer tbltype) {
		this.tbltype = tbltype;
	}

	public String getWjkmc() {
		return this.wjkmc;
	}

	public void setWjkmc(String wjkmc) {
		this.wjkmc = wjkmc;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}