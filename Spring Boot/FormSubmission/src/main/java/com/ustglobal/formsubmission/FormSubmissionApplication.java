package com.ustglobal.formsubmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FormSubmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormSubmissionApplication.class, args);
	}

}
