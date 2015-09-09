package com.bwzk.pojo;
// default package


public class DFile implements java.io.Serializable {
	/** serialVersionUID*/
	private static final long serialVersionUID = 318705003508005297L;
	private Integer did;
	private Integer pid;
	private String title;
	private String wenhao = "";//编号
	private String f5 = "";//工 号
	private String f1 = "";//工程代号
	private String f11 = "";//版本号
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWenhao() {
		return wenhao;
	}
	public void setWenhao(String wenhao) {
		this.wenhao = wenhao;
	}
	public String getF5() {
		return f5;
	}
	public void setF5(String f5) {
		this.f5 = f5;
	}
	public String getF1() {
		return f1;
	}
	public void setF1(String f1) {
		this.f1 = f1;
	}
	public String getF11() {
		return f11;
	}
	public void setF11(String f11) {
		this.f11 = f11;
	}
	
}