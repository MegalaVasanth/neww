package org.day3.bikeinformation9.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println(" Implement menthod Cost");
	}

	@Override
	public void speed() {
		System.out.println(" Implement menthod Speed");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
}
