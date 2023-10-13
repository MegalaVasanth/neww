package org.employeedetails.emp;

public class Employee {
	private void empId() {
		System.out.println("23476");
	}
	private void empName() {
System.out.println("megala");
	}
	private void empDob() {
System.out.println("25-12-2001");
	}
	private void empPhone() {
System.out.println("876543214");
	}
	private void empEmail() {
		System.out.println("megs@gmail.com");

	}
	private void empAddress() {
System.out.println("No:2, Gandhi street,\nvadapalani,\nchennai-636009");
	}

	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
	}

}
