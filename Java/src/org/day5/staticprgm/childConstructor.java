package org.day5.staticprgm;

public class childConstructor extends ParentConstructor {
	public childConstructor() {
		super();
		System.out.println("Inside the childConstructor ");
	}
	public static void main(String[] args) {
		childConstructor child = new childConstructor();
	}

}
