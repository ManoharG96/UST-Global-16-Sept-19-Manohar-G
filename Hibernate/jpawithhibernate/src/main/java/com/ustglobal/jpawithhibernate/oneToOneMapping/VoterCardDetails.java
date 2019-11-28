package com.ustglobal.jpawithhibernate.oneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name = "VoterCardDetails")
public class VoterCardDetails {

	@Column
	@Id
	private int vId;
	
	@Column
	private String vName;
	
	@Exclude //toString excluded
	@OneToOne(mappedBy = "cDetails")
	private PersonDetails pDetails; 
	
}
