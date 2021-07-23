package com.revature.project.SchoolManagement;

public class Student {
    Integer studentRollNo;
    String studentName;
    String studentDob;
    String studentStd;
    String studentAddress;
	public Student(Integer studentRollNo, String studentName, String studentDob, String studentStd,
			String studentAddress) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentDob = studentDob;
		this.studentStd = studentStd;
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", studentDob=" + studentDob
				+ ", studentStd=" + studentStd + ", studentAddress=" + studentAddress + "]";
	}
	
}
