package com.ustglobal.springcore.di;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component ("helloPeople")
public class HelloPeople {

	private String message;
	
	private Map<String, Integer> map;

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getMessage() {
		return message;	
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public void init() {
		System.out.println("init() executing from HelloPeople");	
	}

	public void destroy() {
		System.out.println("destory() executing from HelloPeople");
	}

}
