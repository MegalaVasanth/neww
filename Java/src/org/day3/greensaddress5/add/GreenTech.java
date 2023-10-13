package org.day3.greensaddress5.add;

public class GreenTech {
	private void greensOmr(long phoneNumber) {
		System.out.println("phoneNumber:"+phoneNumber);
	}

	private void greensOmr(long phoneNumber, String name) {
		System.out.println("phoneNumber:"+phoneNumber+"name"+name);
	}

	private void greensOmr(long phoneNumber, String name, int no) {
		System.out.println("phoneNumber"+phoneNumber+"name"+name+"no"+no);
	}

	private void greensOmr(String modelName, int imie, long phoneNum) {
		System.out.println("IMIE:" + imie + " phoneNum:" + phoneNum + " Name:" + modelName);
	}
	public static void main(String[] args) {
		GreenTech gen = new GreenTech();
		gen.greensOmr(9876543221L);
		gen.greensOmr(9877757234L, "megaa");
		gen.greensOmr(99887776655L, "Raj", 4567);
		gen.greensOmr("oppo", 6767, 897654321L);
	}
}
