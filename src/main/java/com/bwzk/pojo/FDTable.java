package com.bwzk.pojo;

/**
 * FDFile0Id entity.
 * 
 * @author MyEclipse Persistence Tools
 */
import java.util.List;
public class FDTable implements java.io.Serializable {

	private Integer did;
	private String fieldname;//英文名/是否下拉/下拉表名称
	private String chname;
	private Integer fieldtype;
	private Integer length;
	private Integer notnull;
	private Integer notdup;
	private Integer notinweb;
	private Integer fcattr;
	private Integer fmattr;
	private String readonlycols;
	private String tablename;//F表的表名称
	private List<FDTable> children;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public String getChname() {
		return chname;
	}
	public void setChname(String chname) {
		this.chname = chname;
	}
	public Integer getFieldtype() {
		return fieldtype;
	}
	public String getFieldtypeName() {
		switch (fieldtype) {
		case 1:
			return "字符";
		case 3:
			return "数字";
		case 11:
			return "日期";
		case 6:
			return "浮点";
		}
		return null;
	}
	public void setFieldtype(Integer fieldtype) {
		this.fieldtype = fieldtype;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getNotnull() {
		return notnull;
	}
	public void setNotnull(Integer notnull) {
		this.notnull = notnull;
	}
	public Integer getNotdup() {
		return notdup;
	}
	public void setNotdup(Integer notdup) {
		this.notdup = notdup;
	}
	public Integer getNotinweb() {
		return notinweb;
	}
	public void setNotinweb(Integer notinweb) {
		this.notinweb = notinweb;
	}
	public Integer getFcattr() {
		return fcattr;
	}
	public void setFcattr(Integer fcattr) {
		this.fcattr = fcattr;
	}
	public Integer getFmattr() {
		return fmattr;
	}
	public void setFmattr(Integer fmattr) {
		this.fmattr = fmattr;
	}
	public String getReadonlycols() {
		return readonlycols;
	}
	public void setReadonlycols(String readonlycols) {
		this.readonlycols = readonlycols;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fieldname == null) ? 0 : fieldname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final FDTable other = (FDTable) obj;
		if (fieldname == null) {
			if (other.fieldname != null)
				return false;
		} else if (!fieldname.equals(other.fieldname))
			return false;
		return true;
	}
	public List<FDTable> getChildren() {
		return children;
	}
	public void setChildren(List<FDTable> children) {
		this.children = children;
	}
	public FDTable(String fieldname, String chname) {
		super();
		this.fieldname = fieldname;
		this.chname = chname;
	}
	public FDTable() { }
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

}