package com.ustglobal.oneToManyMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="PencilBox")
public class PencilBox {

	@Id
	@Column
	private int bId;
	
	@Column
	private String bName;
	
	@Exclude//exclude toString method
	@OneToMany (mappedBy = "pencilBox")
	private List<PencilDetails> pencilDetails;

}
