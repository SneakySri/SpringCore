package com.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new AnnotationConfigApplicationContext(Studentconfigure.class);
		
		Student st=con.getBean(Student.class);
		
		System.out.println(st);

	}

}
