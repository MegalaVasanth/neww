package org.network.networkinformation11;

public class wifi {
	private void wifiName() {
		System.out.println("Airtel Wifi Network");
	}
	public static void main(String[] args) {
		wifi w = new wifi();
		w.wifiName();
		
		MobileData m = new MobileData();
		m.dataName();
		
		Lan l = new Lan();
		l.lanName();
		
		Wireless wr = new Wireless();
		wr.modamName();
		
	}
}
