package com.bwzk.pojo.jaxb;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/** 
 * @author  izerui.com
 * @version createtime：2013年11月27日 下午1:16:12 
 */
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name="field",propOrder={"notnull","length","fieldtype","chname","fieldname","thevalue"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="field")
public class Field {
	@XmlAttribute
	private String fieldname;
	@XmlAttribute
	private String chname;
	@XmlAttribute
	private Integer fieldtype;
	@XmlAttribute
	private Boolean notnull;
	@XmlAttribute
	private Integer length;
	@XmlAttribute
	private String thevalue;
	
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
	public void setFieldtype(Integer fieldtype) {
		this.fieldtype = fieldtype;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Boolean getNotnull() {
		return notnull;
	}
	public void setNotnull(Boolean notnull) {
		this.notnull = notnull;
	}
	public String getThevalue() {
		return thevalue;
	}
	public void setThevalue(String thevalue) {
		this.thevalue = thevalue;
	}
}
