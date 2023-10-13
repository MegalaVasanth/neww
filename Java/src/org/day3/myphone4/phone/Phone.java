package org.day3.myphone4.phone;

public class Phone {
	private void phoneInfo(int imie, long phoneNum, String modelName) {
		System.out.println("IMIE:" + imie + " phoneNum:" + phoneNum + " modelName:" + modelName);
	}

	private void phoneInfo(String modelName, int imie, long phoneNum) {
		System.out.println("IMIE:" + imie + " phoneNum:" + phoneNum + " modelName:" + modelName);
	}

	private void phoneInfo(long phonNum, int imie, String modelName) {
		System.out.println("IMIE:" + imie + " phoneNum:" + phonNum + " modelName:" + modelName);
	}

	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo(345678, 987654321L, "Redmi");
		ph.phoneInfo("Redmi", 345678, 987654321L);
		ph.phoneInfo(987654321L, 345678, "Redmi");
	}
}
