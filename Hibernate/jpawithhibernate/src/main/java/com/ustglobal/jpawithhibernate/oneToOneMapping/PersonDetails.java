package com.ustglobal.jpawithhibernate.oneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="PersonDetails")
public class PersonDetails {
	
	@Column
	@Id
	private String pName;
	
	@Column
	private String pId;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "vId")
	private VoterCardDetails cDetails;
	
}
