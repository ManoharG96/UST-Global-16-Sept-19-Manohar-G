package com.ustglobal.productspringmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "orderlist")
public class OrderBean {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;

	private int retailerId;
	@Column
	private int pricePerUnit;
	@Column
	private int productName;

}
