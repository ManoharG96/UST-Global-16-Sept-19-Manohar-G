package com.ustglobal.productspringmvc.dto;

import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table (name = "orderlist")
public class OrderBean {

	@ManyToOne
	@JoinTable (name = "orderId")
	private int orderId;
	@ManyToOne
	@JoinTable (name = "retailerId")
	private int retailerId;
	@Column
	private int pricePerUnit;
	@Column
	private int productName;

}
