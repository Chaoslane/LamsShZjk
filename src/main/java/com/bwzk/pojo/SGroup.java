package com.bwzk.pojo;

import java.io.Serializable;

public class SGroup implements Serializable {
	private static final long serialVersionUID = 7668913055238566167L;

	private Integer did;

    private Integer pid;

    private String qzh;

    private Integer gid;

    private String gname;

    private String bz;

    private String depcode;

    private String depid;
    
    private String gfzj;//数据供应方主键
    
    private String bh ; //部门编号

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

	public String getQzh() {
		return qzh;
	}

	public void setQzh(String qzh) {
		this.qzh = qzh;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getDepcode() {
		return depcode;
	}

	public void setDepcode(String depcode) {
		this.depcode = depcode;
	}

	public String getDepid() {
		return depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getGfzj() {
		return gfzj;
	}

	public void setGfzj(String gfzj) {
		this.gfzj = gfzj;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}
    
    
}