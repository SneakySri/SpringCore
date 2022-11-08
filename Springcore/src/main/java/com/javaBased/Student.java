package com.javaBased;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    private String std;
    
    @Autowired
    private Address add;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String std, Address add) {
		super();
		this.name = name;
		this.std = std;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", std=" + std + ", add=" + add + "]";
	}
	
	
//	static void init() {
//		System.out.println("hi");
//	}
//	static void destroy() {
//		System.out.println("bye");
//	}



    
}
