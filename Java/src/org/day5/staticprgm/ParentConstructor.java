package org.day5.staticprgm;

public class ParentConstructor extends GrandConstructor {
	public ParentConstructor() {
		super(23);
		System.out.println("Inside the ParentConstructor..");
	}
	public void dis() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		ParentConstructor b= new ParentConstructor();
	}

}
