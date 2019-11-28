package com.ustglobal.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productinfo")
public class ProductInfo {
	
	@Column
	@Id
	private int pId;
	@Column
	private	String pName;
	@Column
	private int pQuantity;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQunatity) {
		this.pQuantity = pQunatity;
	}
	@Override
	public String toString() {
		return "ProductInfo [pId=" + pId + ", pName=" + pName + ", pQuantity=" + pQuantity + "]";
	}
	
	
}
