package org.day3.educationinformation7.edu;

public class Arts extends Education {
	private void bSc() {
		System.out.println("BSc.,");
	}

	private void bEd() {
		System.out.println("BEd.,");
	}

	private void bA() {
		System.out.println("BA.,");
	}

	public void ug() {
		System.out.println("override ug method");
		super.ug();
		this.bSc();
	}

	public void pg() {
		System.out.println("Override PG method");
		super.pg();
	}
	public static void main(String[] args) {
		Arts a = new Arts();
		a.pg();
		a.ug();
	}
}
