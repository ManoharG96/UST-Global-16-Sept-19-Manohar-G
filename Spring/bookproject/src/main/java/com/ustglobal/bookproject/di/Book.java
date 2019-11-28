package com.ustglobal.bookproject.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Book {
	@Autowired
	@Qualifier ("author")
	private Author author;
	private String bName;
	private int bPrice;
}
