package org.transport;
//Question 10
import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void transportForm() {
		System.out.println("Modes of Transport : air, Land, Water");
	}
	public static void main(String[] args) {
		Transport t = new Transport();
		t.transportForm();
		System.out.println("\nRoad:");
		Road r = new Road();
		r.bike();r.bus();r.bus();r.cycle();
		
		System.out.println("\nAir:");
		Air a = new Air();
		a.aeroPlane();
		a.heliCopter();
		
		System.out.println("\nWater:");
		Water w = new Water();
		w.boat();
		w.ship();
	}
}
