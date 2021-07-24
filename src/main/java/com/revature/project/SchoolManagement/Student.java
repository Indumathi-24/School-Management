package com.revature.project.SchoolManagement;

public class Student {
	Integer rollNo;
	String name;
	String dob;
	String standard;
	String address;

	public Student(Integer rollNo, String name, String dob, String standard, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.standard = standard;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", standard=" + standard + ", address="
				+ address + "]";
	}

}
