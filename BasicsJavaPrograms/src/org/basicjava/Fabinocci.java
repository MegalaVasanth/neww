package org.basicjava;

import java.util.ArrayList;
import java.util.List;

public class Fabinocci {
	public static void main(String[] args) {
//		int a = 0, b = 1;
//		int n = 3;
//		System.out.print(a + " " + b);
//
//		for (int i = 0; i < n; i++) {
//
//			a = a + b;
//			b = a + b;
//			System.out.print(" " + a + " " + b);
//
//		}
//		for (int i = 2; i <=n; i++) {
//			int c= a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}

		// Odd or Even
//		int num = 10;
//		ArrayList<Integer> even = new ArrayList<Integer>();
//		List<Integer> odd = new ArrayList<Integer>();
//		for (int i = 0; i < num; i++) {
//			if (i % 2 == 0) {
//				// System.out.println("even"+i);
//				even.add(i);
//			} else {
//				System.out.println("odd: " + i);
//				odd.add(i);
//			}
//		}
//		System.out.println("Even Number:");
//		for (Integer integer : even) {
//			System.out.println(integer);
//		}
//
//		System.out.println("Odd Number:");
//		for (int j = 0; j < odd.size(); j++) {
//			System.out.println(odd.get(j));
//		}

		// Factorial
		int factNum = 5;
		int factorial = 1;
		int temp=1;
		for (int i = 1; i <= factNum; i++) {
			temp=i;
			factorial = factorial * i;
			System.out.print(temp+"*");
			
		}
		
		System.out.println("="+factorial);
		
	}

}
