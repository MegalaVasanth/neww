package org.phonedetails.phone;

public class InternalStorage {

	private void processName() {
		System.out.println("Intel");
	}

	private void ramSize() {
		System.out.println("8GB");
	}
	public static void main(String[] args) {
		ExternalStorage e = new ExternalStorage();
		e.size();
		
		InternalStorage i = new InternalStorage();
		i.processName();
		i.ramSize();
	}
}
