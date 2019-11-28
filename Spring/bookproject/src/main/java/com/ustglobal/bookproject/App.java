package com.ustglobal.bookproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.bookproject.di.Book;
import com.ustglobal.bookproject.config.ConfigurationClass;

public class App {
	public static void main( String[] args ){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Book book = context.getBean(Book.class);
		System.out.println("Author name is: "+book.getAuthor().getName());
		System.out.println("Author Pen Name is: "+book.getAuthor().getPenName());
		System.out.println("Book name is: "+book.getBName());
		System.out.println("Book price is: "+book.getBPrice());
	

		System.out.println("******************");

		ApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Book book1 = context1.getBean(Book.class);
		System.out.println("Author name is: "+book1.getAuthor().getName());
		System.out.println("Author Pen Name is: "+book1.getAuthor().getPenName());
		System.out.println("Book name is: "+book1.getBName());
		System.out.println("Book price is: "+book1.getBPrice());
		System.out.println("******************");

	}
}
