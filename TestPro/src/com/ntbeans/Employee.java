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
		return "Employee [ename=" + ename + ", eno=" + eno + "]";
	}
	
	
	
	

}
