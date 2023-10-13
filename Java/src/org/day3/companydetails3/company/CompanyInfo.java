package org.day3.companydetails3.company;

public class CompanyInfo {
	private void companyName(String name) {
		System.out.println(name);
	}
	
	private void companyName(int num, String name) {
		System.out.println(name + " " + num);
	}
	public static void main(String[] args) {
		CompanyInfo com = new CompanyInfo();
		com.companyName("Megaa");
		com.companyName(3456, "thangavelu");
	}
}
