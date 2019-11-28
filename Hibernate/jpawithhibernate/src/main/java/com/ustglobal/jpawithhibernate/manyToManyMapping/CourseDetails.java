package com.ustglobal.jpawithhibernate.manyToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table (name="CourseDetails")
public class CourseDetails {

	@Id
	@Column
	private int cId;
	@Column
	private String cName;

	@Exclude//exclude toString
	@ManyToMany(cascade = CascadeType.ALL,
	mappedBy = "cDetails")
	private List<StudentDetails> sDetails;
}
