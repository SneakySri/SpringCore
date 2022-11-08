package com.javaBasedStudents;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;


@Scope("prototype")
public class Employee {
	private int id;
	private String name;
	private String design;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String design) {
		super();
		this.id = id;
		this.name = name;
		this.design = design;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", design=" + design + "]";
	}
	
	@PostConstruct
	void init() {
		System.out.println("i am at init block");
	}
	@PreDestroy
	void destroy() {
		System.out.println("i am at destroy block");
	}
	

}
