package com.ustglobal.bookproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.bookproject.di.Author;
import com.ustglobal.bookproject.di.Book;

@Configuration
public class ConfigurationClass {

	@Bean (name = "author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("Chetan Bhagat");
		author.setPenName("Bhagat");
		return author;
	}
	
	@Bean (name = "book")
	public Book getBook() {
		Book book = new Book();
		book.setAuthor(getAuthor());
		book.setBName("2 states");
		book.setBPrice(400);
		return book;
	}
	
	
}
