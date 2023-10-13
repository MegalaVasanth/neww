package org.override;

public class Parent extends GrandParent {
	public void move() {
		System.out.println("Parent move");
	}

	protected void mine() {
		System.out.println(" Parent mine");
	}

}
