package com.ustglobal.dependencydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ustglobal.dependencydemo.dto.EmployeeBean;

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyDemoApplication.class, args);
		EmployeeBean emp = context.getBean(EmployeeBean.class);
		emp.display();

	}

}
