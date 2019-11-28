package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.HelloPeople;

public class LifeCycleBean {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloPeople people = context.getBean(HelloPeople.class);
		System.out.println(people.getMessage());
		context.close();
	
	}
}
