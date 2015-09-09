package com.bwzk.pojo;

import java.io.Serializable;
import java.util.Date;

public class SBacklog implements Serializable {
	private static final long serialVersionUID = -7844196895241878880L;

	private Integer did;

    private Integer urgency;

    private Integer pid;

    private String ptable;

    private String title;

    private String opermodulezh;

    private String opermoduleowner;

    private Integer opertype;

    private Date operdate;

    private String usercode;

    private Integer isoper;

    private String detail;

    private String bz;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getUrgency() {
        return urgency;
    }

    public void setUrgency(Integer urgency) {
        this.urgency = urgency;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtable() {
        return ptable;
    }

    public void setPtable(String ptable) {
        this.ptable = ptable == null ? null : ptable.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getOpermodulezh() {
        return opermodulezh;
    }

    public void setOpermodulezh(String opermodulezh) {
        this.opermodulezh = opermodulezh == null ? null : opermodulezh.trim();
    }

    public String getOpermoduleowner() {
        return opermoduleowner;
    }

    public void setOpermoduleowner(String opermoduleowner) {
        this.opermoduleowner = opermoduleowner == null ? null : opermoduleowner.trim();
    }

    public Integer getOpertype() {
        return opertype;
    }

    public void setOpertype(Integer opertype) {
        this.opertype = opertype;
    }

    public Date getOperdate() {
        return operdate;
    }

    public void setOperdate(Date operdate) {
        this.operdate = operdate;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public Integer getIsoper() {
        return isoper;
    }

    public void setIsoper(Integer isoper) {
        this.isoper = isoper;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}