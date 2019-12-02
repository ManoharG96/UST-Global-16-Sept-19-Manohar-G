package com.ustglobal.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@InitBinder()
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.getDisallowedFields();
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		EmployeeBean bean = service.login(id, password);
		if (bean == null) {
			request.setAttribute("message", "Invalid Id and Password");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(EmployeeBean bean, ModelMap map) {
		int check = service.registerEmployee(bean);
		if (check > 0)
			map.addAttribute("message", "Register Successfully and Your ID: " + check);
		else
			map.addAttribute("message", "Email Repeated");
		return "login";
	}

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required = false) EmployeeBean bean) {
		if (bean == null) {
			map.addAttribute("message", "Login Please");
			return "login";
		} else {
			return "home";
		}
	}

	@PostMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/search")
	public String search(@RequestParam("id") int id, ModelMap map) {
		EmployeeBean bean = service.searchEmployee(id);
		if (bean == null) {
			map.addAttribute("message", "Data not found");
		} else {
			map.addAttribute("bean", bean);
			System.out.println(bean);
		}
		return "home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}

	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
		try {
			service.deleteEmployee(bean.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		session.invalidate();
		return "login";
	}


	@GetMapping("/changepassword") 
	public String changePassword(HttpServletRequest request) { 
		HttpSession session = request.getSession(false); 
		if(session!=null) {
			return "changepassword"; 
		}else{ 
			return "login";
		} 
	}

	@PostMapping("/changepassword")
	public String changePassword(String newpassword, String confirmpassword, @SessionAttribute(name="bean")EmployeeBean bean, ModelMap map) { 
		if (newpassword.equals(confirmpassword)) {
			service.changePassword(bean.getId(), newpassword);
			map.addAttribute("message", "Password Changed"); 
		}else {
			map.addAttribute("message", "Password Not Changed"); 
		} 
		return "home"; }



	@GetMapping("/update") 
	public String update(HttpServletRequest request, ModelMap map) {
		HttpSession session = request.getSession(false); 
		if(session!=null) { 
			return "update"; 
		}else { 
			map.addAttribute("message", "Login First");
			return "login"; 
		}
	}



	@PostMapping("/update") 
	public String updateProfile(EmployeeBean bean, HttpSession session, ModelMap map) { 
		EmployeeBean employeeBean = (EmployeeBean) session.getAttribute("bean");
		bean.setId(employeeBean.getId());	
		boolean check = service.updateEmployee(bean);

		if(check) {
			map.addAttribute("message", "Profile Updated Successfully");
			session.setAttribute("bean", employeeBean);
			return "home";
		} else {
			map.addAttribute("message", "Try Again Please");
		}
		return "update"; 

	}

}
