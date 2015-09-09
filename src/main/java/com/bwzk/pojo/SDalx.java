package com.bwzk.pojo;

import java.util.Date;
import java.util.List;

public class SDalx implements java.io.Serializable {

	// Fields

	private Integer did;
	private Integer qzid;
	private Integer code;
	private String chname;
	private Integer hasprj;
	private Integer hasvol;
	private Integer hascattable;
	private Integer glms;
	private String bz;
	private Integer status;
	private String creator;
	private Date createtime;
	private String editor;
	private Date edittime;
	private String deltor;
	private Date deltime;
	private String alldataright;
	private Integer datarange;//数据范围 0:所有部门数据 1：本部门数据 2：本人数据
	
	/*level
	0:项目级
	1:案卷级
	2:文件级
	3：收发文
	20:编研库
	21:数据字典表
	
	log
	 3. 电子文件
	 4. 收发文
	 5:{//临时赋权审批日志
	 13:{//登陆日志
	 15:{//电子文件利用日志
	 6:{//打包推送日志
	 (30 -- 39 规定为三员权限范围)
	 31. 三员用户登录日志
	 32. 组织机构操作日志
	 33. 角色权限设置日志
	 34. 用户授权日志
	*/
    private Integer level;
	//所有子
	private List<SDalx> children;

	public SDalx() {
	}

	/** minimal constructor */
	public SDalx(Integer code, String chname, Integer hasprj, Integer hasvol,
			Integer hascattable, Integer glms, Integer status) {
		this.code = code;
		this.chname = chname;
		this.hasprj = hasprj;
		this.hasvol = hasvol;
		this.hascattable = hascattable;
		this.glms = glms;
		this.status = status;
	}

	public SDalx(Integer qzid, Integer code, String chname, Integer hasprj,
			Integer hasvol, Integer hascattable, Integer glms, String bz,
			Integer status, String creator, Date createtime, String editor,
			Date edittime, String deltor, Date deltime , Integer datarange) {
		this.qzid = qzid;
		this.code = code;
		this.chname = chname;
		this.hasprj = hasprj;
		this.hasvol = hasvol;
		this.hascattable = hascattable;
		this.glms = glms;
		this.bz = bz;
		this.status = status;
		this.creator = creator;
		this.createtime = createtime;
		this.editor = editor;
		this.edittime = edittime;
		this.deltor = deltor;
		this.deltime = deltime;
		this.datarange = datarange;
	}
	
	/**
	 * @param chname<br>
	 */
	public SDalx(String chname , Integer level) {
		this.qzid = -1;
		this.code =  -1;
		this.level = level;
		this.did = 1;
		this.chname = chname;
	}
	
	public SDalx(Integer code) {
		this.code = code;
	}

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getChname() {
		return this.chname;
	}

	public void setChname(String chname) {
		this.chname = chname;
	}

	public Integer getHasprj() {
		return this.hasprj;
	}

	public void setHasprj(Integer hasprj) {
		this.hasprj = hasprj;
	}

	public Integer getHasvol() {
		return this.hasvol;
	}

	public void setHasvol(Integer hasvol) {
		this.hasvol = hasvol;
	}

	public Integer getHascattable() {
		return this.hascattable;
	}

	public void setHascattable(Integer hascattable) {
		this.hascattable = hascattable;
	}

	public Integer getGlms() {
		return this.glms;
	}

	public void setGlms(Integer glms) {
		this.glms = glms;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public List<SDalx> getChildren() {
		return children;
	}

	public void setChildren(List<SDalx> children) {
		this.children = children;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final SDalx other = (SDalx) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	public String getAlldataright() {
		return alldataright;
	}

	public void setAlldataright(String alldataright) {
		this.alldataright = alldataright;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public Integer getParentLevel(){
		Integer result = 2;//默认最高级别为文件级
		if(hasvol==1){
			result = 1;
		}
		if(hasprj == 1){
			result = 0;
		}
		return result;
	}

	public Integer getDatarange() {
		return datarange == null ? 0 : datarange;
	}
	public void setDatarange(Integer datarange) {
		this.datarange = datarange;
	}
}