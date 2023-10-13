package org.day3.computer10;

public class Desktop implements  Software, HardWare {

	@Override
	public void softwareResources() {
		System.out.println("implemented interface Sofware Method\n");
	}

	@Override
	public void hardwareResources() {
		System.out.println("implemented interface Hardware Method");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.hardwareResources();
		d.softwareResources();
		
		HardWare hd = new Desktop();
		hd.hardwareResources();
		
	}
}
