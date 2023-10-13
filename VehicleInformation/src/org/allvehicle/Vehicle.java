package org.allvehicle;

import org.fourwheeler.Fourwheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

//QUESTION 9
public class Vehicle {
	private void VehicleNecessery() {
		System.out.println("Transport a Person or things");
	}

	public static void main(String[] args) {
		Vehicle ve = new Vehicle();
		ve.VehicleNecessery();

		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();

		ThreeWheeler th = new ThreeWheeler();
		th.auto();

		Fourwheeler fo = new Fourwheeler();
		fo.car();
		fo.bus();
		fo.lorry();
	}
}
