package org.override;

public class Child extends Parent {
	public void move() {
		// super.move();
		System.out.println("Child moves");
		this.bark();
	}

	private void bark() {
		System.out.println(" child Bark");
	}

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();
		c.move();
		//note: using parent ref obj we cant access child property
		//p.bark();
	}
}
