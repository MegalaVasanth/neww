package org.day3.bankdetail6.bank;

public class AxisBank extends BankInfo {
	public void deposite() {
		System.out.println("override deposite method");
		super.deposite();
	}

	public static void main(String[] args) {
		AxisBank ax = new AxisBank();
		ax.deposite();
	}
}
