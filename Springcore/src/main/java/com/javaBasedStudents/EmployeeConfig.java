package com.javaBasedStudents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {
	
	
	@Bean
	public Employee emp() {
		
		Employee emp=new Employee();
		
		return emp;
	}

}
