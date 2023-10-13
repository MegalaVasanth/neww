package org.basicjava;

public class NumberReverseString {
	public static void main(String[] args) {
		// int num = 12345;
		// String revnum = Integer.toString(num);
		// int len= revnum.length();

//		String str = "mam";
//		int strlen = str.length();
//		String col = "";
//		for (int i = strlen - 1; i >= 0; i--) {
//			// for int rev
//			// char appent =revnum.charAt(i);
//
//			char appent = str.charAt(i);
//			col = col + appent;
//
//		}
//		System.out.println(col);
//		if (col.equals(str)) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("not a Palindrome");
//		}

		// word reverse

		String str = "welcome to my class";
		String[] split = str.split("");
		String string = "";
		// Task: ssalc ym ot emoclew
		for (int i = split.length - 1; i >= 0; i--) {
			// reversing word
			string = string + split[i].toString();
			//string=string+split.charAt(i);
		}
		System.out.println(string);
		
		// Task : emoclew ot ym ssalc

		String[] split2 = string.split(" ");
		for (int i = split2.length - 1; i >= 0; i--) 
		{
			System.out.print(split2[i] + " ");
		}
		
	}

}
