package com.ntbeans;

public class Employee {
	
	String ename;
	
	String eno;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	@Override
	public String toString() {
		System.out.println("by tl");
		System.out.println("abc 123");
		return "Employee [ename=" + ename + ", eno=" + eno + "]";
	}
	
	
	
	

}
