package com.ustglobal.jpawithhibernate.manyToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="StudentDetails")
public class StudentDetails {

	@Id
	@Column
	private int sId;
	@Column
	private String sName;

	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (name="StudentCourse", 
	joinColumns = @JoinColumn(name="sId"), 
	inverseJoinColumns = @JoinColumn(name="cId"))
	private List<CourseDetails> cDetails;
}
