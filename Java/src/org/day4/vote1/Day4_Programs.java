package org.day4.vote1;
import java.util.Scanner;

public class Day4_Programs {
	// vote elligibility
	/*
	 * public static void main(String[] args) { Scanner obj = new
	 * Scanner(System.in);
	 * 
	 * System.out.println(" Enter Your Age:"); int vt = obj.nextInt(); if(vt >= 18)
	 * { System.out.println("You're Eligible to Vote "); } else
	 * System.out.println("older than or equal 1 to 18 years old"); }
	 * 
	 */
	// check given number is odd or even

	/*
	 * public static void main(String[] args) { Scanner obj1 = new
	 * Scanner(System.in);
	 * 
	 * System.out.println("Enter a Whole Number : "); int num = obj1.nextInt();
	 * if(num%2==0) System.out.println("Even"); else System.out.println("Odd");
	 * 
	 * }
	 */
	// even Number 1 to 100
	/*
	 * public static void main(String[] args) { System.out.println("even Numers :");
	 * for (int i = 0; i < 100;) { i=i+2; System.out.print (i+" ");
	 * 
	 * }
	 */
	// sum of odd number from 1 to 100
	public static void main(String[] args) {
		int i ;
		int sum=0;
		for ( i=1 ; i <= 100;) {
			System.out.println(i);
			sum=sum+i;
			i = i + 2;
			
			
		}
		System.out.println("Sum :"+sum);

	}

}
