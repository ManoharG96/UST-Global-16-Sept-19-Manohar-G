package com.ustglobal.employeewebapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping ("/details")
	public String disp(@RequestParam("name") String ename, HttpSession session) {
		session.setAttribute("name", ename);
		System.out.println("Employee name: "+ename);
		return "employee";
	}
	
	@RequestMapping("/model")
	public ModelAndView disp(@RequestParam("name") String name) {
		ModelAndView view = new ModelAndView();
		view.addObject("ename", name);
		view.setViewName("employee");
		System.out.println("Employee name: "+name);
		return view;
	}
}
