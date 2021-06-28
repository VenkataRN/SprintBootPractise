package com.example.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int custid;
	private String custName;
	private String custCourse;
	

	
	public Customers(int custid, String custName, String custCourse) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custCourse = custCourse;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustCourse() {
		return custCourse;
	}
	public void setCustCourse(String custCourse) {
		this.custCourse = custCourse;
	}

	public void displayCourseName() {
		System.out.print("Printing Customers CourseName");	
	}

	

}
