package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;

@RestControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(208);
		response.setMessage("Error in the code");
		response.setDescription("Exception has occured in the code");
		return response;
	}

}
