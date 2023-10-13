package org.day2_college;

public class Student extends College {
	public void studentName() {
		System.out.println("Eshwaa");
	}

	public void studentDept() {
		System.out.println("Computer Science");
	}

	public void studentId() {
		System.out.println("CSE45678");
		
	}
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		
		
		stu.hostelName();
		
		stu.deptName();
		
	}
}
