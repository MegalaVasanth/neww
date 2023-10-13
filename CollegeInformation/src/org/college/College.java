package org.college;

public class College {
	private void collegeName() {
		System.out.println("Sathyabama Arts and science");
	}

	private void collegeCode() {
		System.out.println("6895");
	}

	private void collegeRank() {
		System.out.println("8 th Rank");
	}
	public static void main(String[] args) {
		
		College col = new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		
		Hostel hs = new Hostel();
		hs.hostelName();
		
		Dept d = new Dept();
		d.deptName();
		
	}
}
