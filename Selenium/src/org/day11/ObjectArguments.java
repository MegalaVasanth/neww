package org.day11;

public class ObjectArguments {
	private void test(Object ...a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}
	public static void main(String[] args) {
		
		ObjectArguments obj = new ObjectArguments();
		obj.test("he",1,2,3,4,5,6,6,7,8,89,90);
	}

}
