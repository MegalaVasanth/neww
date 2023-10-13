package org.privat;
// public,final & abstract permitted
public class A {
	private int privateData = 10;

	private void print() {
		System.out.println("Private data:"+privateData);
	}

	public static void main(String[] args) {
// private access specifier WITHIN CLASS
		A aobj = new A();
		aobj.print();
		
	}
	
}
