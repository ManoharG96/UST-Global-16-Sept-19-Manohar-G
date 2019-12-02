package com.ustglobal.empspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class ORMConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean getBean() {
	LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
	bean.setPersistenceUnitName("employee-unit");
		
		return bean;
		
	}
	
}
