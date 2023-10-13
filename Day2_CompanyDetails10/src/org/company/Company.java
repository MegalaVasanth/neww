package org.company;

import org.client.Client;

public class Company extends Client {

	private void companyName() {
		System.out.println(" Company Name : TCS");
	}
	public static void main(String[] args) {
		Company co = new Company();
		co.companyName();
		
		co.clientName();
	}
}
