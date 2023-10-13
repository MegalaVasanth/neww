package org.company;

public class CompanyInfo {
	private void companyName() {
System.out.println("Company Name: HCL ");
	}
	private void companyId() {
System.out.println("Company Id: 567890");
	}
	private void companyAddress() {
System.out.println("Company Address: SIPCOT");
	}

	public static void main(String[] args) {
		CompanyInfo com = new CompanyInfo();
		com.companyName();
		com.companyId();
		com.companyAddress();

	}

}
