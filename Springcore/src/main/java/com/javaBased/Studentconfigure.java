package com.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Studentconfigure {
	
	@Bean
	public Student stud() {
			
		return new Student("Sriram","eight",add());
		
	}
	@Bean
	public Address add() {
		
		return  new Address("TamilNadu","India");
		
	}
	

}
