package com.ntbeans;

public class Student {
	
	
	private String sid;
	private String sname;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

	
	public void m1()
	{
		System.out.println("In employee class");
	}
	
}
