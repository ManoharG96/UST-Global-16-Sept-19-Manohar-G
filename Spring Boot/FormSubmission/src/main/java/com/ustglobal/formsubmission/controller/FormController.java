package com.ustglobal.formsubmission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@GetMapping("/form")
	public String form() {
		return "form";
	}

	@PostMapping("/form")
	public String formDetails(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("email", email);
		map.addAttribute("password", password);
		return "formdetails";
	}
}
