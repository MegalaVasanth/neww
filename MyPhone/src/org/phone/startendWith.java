package org.phone;

import java.util.Scanner;

//QUESTION 9
public class startendWith {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		// QUESTION 9.1 & 9.2
		System.out.println("Enter a String..");
		String nextLine = sobj.nextLine();

		System.out.println("Enter pre or suf or emp");
		String key = sobj.nextLine();
		switch (key) {
		case "pre": {
			if (nextLine.startsWith("welcome")) {
				System.out.println(nextLine.startsWith("welcome"));
			} else {
				System.out.println(nextLine.startsWith("welcome"));
			}

			break;
		}
		//QUESTION 9.4
		case "suf": {
			if (nextLine.endsWith("class") || nextLine.endsWith("java")) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;

		}
		//QUESTION 9.5 & QUESTION 9.6
		case "emp": {
			if (nextLine.isEmpty()) {
				System.out.println(nextLine.isEmpty());
			} else {
				System.out.println("false");
			}

			break;
		}
		default:
			System.out.println("default...");
			break;
		}

		sobj.close();
	}

}
