package org.basicjava;

public class LeftangleTriangePrgm {
	public static void main(String[] args) {

//1 
//2 3 
//4 5 6 
		int a = 1;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();

		}

//			1 
//		   * * 
//		  3 3 3 
//		 * * * * 
//		5 5 5 5 5 

//		int n = 4;
//		for (int i = 1; i <= 5; i++) {
//			if (i % 2 == 0) {
//				for (int s = 5; s > i; s--) {
//					System.out.print(" ");
//
//				}
//				for (int j = 1; j <= i; j++) {
//					System.out.print("*" + " ");
//				}
//				System.out.println();
//
//			} else {
//				for (int s = 5; s > i; s--) {
//					System.out.print(" ");
//
//				}
//				for (int j = 1; j <= i; j++) {
//					System.out.print(i + " ");
//				}
//				System.out.println();
//
//			}
//
//		}
	}
}
