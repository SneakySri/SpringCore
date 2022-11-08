package com.core;

public class employee {
	
	private int id;
	private String ename;
	

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "employee [id=" + id + ", ename=" + ename + "]";
	}
	
	
	
	
	


}
