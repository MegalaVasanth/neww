package org.day7.arrayprogram.array;

import java.util.Arrays;

public class ArrayPrgm {
	public static void main(String[] args) {

//QUESTION 1:

//		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int sum = 0;
//		float avg = 0.0f;
//		for (int i = 0; i < num.length; i++) {
//			sum = sum + num[i];
//
//		}
//		System.out.println("Sum:" + sum);
// QUESTION 2:
//		avg = sum % num.length;
//		System.out.println("avg:" + avg);

// QUESTION 3:
		int[] a = { 5, 1, 2, 3, 3 };
		int temp[] = new int[a.length];
		int j = 0;
		int n=a.length;
		Arrays.sort(a);//{1,2,3,3,5,5}
		for (int i = 0; i <n-1 ; i++) {

			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		System.out.println("output:");
		for (int i = 0; i < j; i++) {
	            a[i] = temp[i];
	            System.out.print(a[i]+" ");
	        }

	}

}
