package com.bwzk.pojo;

import java.io.Serializable;

public class SUserWithBLOBs extends SUser implements Serializable {
	private static final long serialVersionUID = 6596879444496462365L;

	private byte[] ini;

    private byte[] inixml;

    public byte[] getIni() {
        return ini;
    }

    public void setIni(byte[] ini) {
        this.ini = ini;
    }

    public byte[] getInixml() {
        return inixml;
    }

    public void setInixml(byte[] inixml) {
        this.inixml = inixml;
    }

	public String toString() {
		return super.getDid()+ " : " +super.getUsercode()+" : "+super.getUsername()+ " : "+ super.getPid();
	}
    
    
}