package org.basicjava;

public class SquarePrgm {

	public static void main(String[] args) {
//		int n = 3;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (i == n) {
//					System.out.print(i - 1 + "");
//				} else {
//					System.out.print(i + "");
//				}
//			}
//			System.out.println();
//		}

		
		int n=10;
		for (int i = 1; i <=n; i++) {
			for(int s=n; s>i;s--)
			{
				System.out.print("	");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(j*i+"	");
			}
			System.out.println();
		}
	}
}









