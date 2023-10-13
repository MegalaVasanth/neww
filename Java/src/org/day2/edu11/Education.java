package org.day2.edu11;

public class Education  extends Arts{
	private void ug() {
		System.out.println("Undergraduate");
	}

	private void pg() {
		System.out.println("Postgraduate");
	}
	public static void main(String[] args) {
		Education ed = new Education();
		ed.ug();
		ed.pg();
		
		ed.bsc();
		ed.bBA();
		ed.bA();
		ed.bEd();
		
		ed.bE();
		ed.bTech();
		
		ed.dental();
		ed.physiyo();
		ed.mbbs();
	}
}
