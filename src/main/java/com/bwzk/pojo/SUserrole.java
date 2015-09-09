package com.bwzk.pojo;

import java.io.Serializable;

public class SUserrole implements Serializable {
	private static final long serialVersionUID = 5730895283927319738L;

    private Integer did;
    private Integer yhid;
    private Integer jsid;
    private String bz;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Integer getYhid() {
		return yhid;
	}
	public void setYhid(Integer yhid) {
		this.yhid = yhid;
	}
	public Integer getJsid() {
		return jsid;
	}
	public void setJsid(Integer jsid) {
		this.jsid = jsid;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
    
    
}