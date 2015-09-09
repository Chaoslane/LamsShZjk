package com.bwzk.pojo;

import java.io.Serializable;
import java.util.Date;

public class SUser implements Serializable {
	private static final long serialVersionUID = 1627863812166469679L;
	private Integer did;

    private Integer pid;

    private String usercode;

    private String username;

    private String passwd;

    private String email;

    private String telO;

    private String telH;

    private String telM;

    private String card;

    private String addrO;

    private String addrH;

    private String qq;

    private String bz;

    private Integer islsyh;

    private Date yxqsrq;

    private Date yxzzrq;

    private String macinfo;

    private Integer checkmac;

    private Integer isempower;

    private String fqjs;

    private String managedep;

    private String mj;

    private String esbid;

    private String esbcode;

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

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelO() {
        return telO;
    }

    public void setTelO(String telO) {
        this.telO = telO == null ? null : telO.trim();
    }

    public String getTelH() {
        return telH;
    }

    public void setTelH(String telH) {
        this.telH = telH == null ? null : telH.trim();
    }

    public String getTelM() {
        return telM;
    }

    public void setTelM(String telM) {
        this.telM = telM == null ? null : telM.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getAddrO() {
        return addrO;
    }

    public void setAddrO(String addrO) {
        this.addrO = addrO == null ? null : addrO.trim();
    }

    public String getAddrH() {
        return addrH;
    }

    public void setAddrH(String addrH) {
        this.addrH = addrH == null ? null : addrH.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Integer getIslsyh() {
        return islsyh;
    }

    public void setIslsyh(Integer islsyh) {
        this.islsyh = islsyh;
    }

    public Date getYxqsrq() {
        return yxqsrq;
    }

    public void setYxqsrq(Date yxqsrq) {
        this.yxqsrq = yxqsrq;
    }

    public Date getYxzzrq() {
        return yxzzrq;
    }

    public void setYxzzrq(Date yxzzrq) {
        this.yxzzrq = yxzzrq;
    }

    public String getMacinfo() {
        return macinfo;
    }

    public void setMacinfo(String macinfo) {
        this.macinfo = macinfo == null ? null : macinfo.trim();
    }

    public Integer getCheckmac() {
        return checkmac;
    }

    public void setCheckmac(Integer checkmac) {
        this.checkmac = checkmac;
    }

    public Integer getIsempower() {
        return isempower;
    }

    public void setIsempower(Integer isempower) {
        this.isempower = isempower;
    }

    public String getFqjs() {
        return fqjs;
    }

    public void setFqjs(String fqjs) {
        this.fqjs = fqjs == null ? null : fqjs.trim();
    }

    public String getManagedep() {
        return managedep;
    }

    public void setManagedep(String managedep) {
        this.managedep = managedep == null ? null : managedep.trim();
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
    }

    public String getEsbid() {
        return esbid;
    }

    public void setEsbid(String esbid) {
        this.esbid = esbid == null ? null : esbid.trim();
    }

    public String getEsbcode() {
        return esbcode;
    }

    public void setEsbcode(String esbcode) {
        this.esbcode = esbcode == null ? null : esbcode.trim();
    }
}