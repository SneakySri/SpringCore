package com.javaBasedStudents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Employee e1=(Employee) con.getBean("emp");
		e1.setId(1);
		e1.setName("Prasanth");
		e1.setDesign("Developer");
		System.out.println(e1);
		
		Employee e2=(Employee) con.getBean("emp");
		System.out.println(e2);
		
//		Employee e3=(Employee) con.getBean("emp");
//		e1.setId(3);
//		e1.setName("Sriram");
//		e1.setDesign("JR.Developer");
//		System.out.println(e3);
		
		((AbstractApplicationContext) con).registerShutdownHook();

	}

}
