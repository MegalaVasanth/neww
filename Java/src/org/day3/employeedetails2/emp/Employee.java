package org.day3.employeedetails2.emp;

public class Employee {
	private void empId(int num) {
		System.out.println("Integer Number:" + num);
	}

	private void empId(double dou) {
		System.out.println("Double Number:" + dou);
	}

	private void empId(long lg) {
		System.out.println("Long Number:" + lg);
	}
	private void empId(float f) {
		System.out.println("Float Number:" + f);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId(234566);
		emp.empId(345678.98);
		emp.empId(987654322);
		emp.empId(235678.345678f);
	}
}
