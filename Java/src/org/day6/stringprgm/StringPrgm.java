package org.day6.stringprgm;
import java.util.Scanner;

public class StringPrgm {

	public static void main(String[] args) {
		// String Length

//		String s1 = "GreensTechnology";
//		String s2 = "SeleniumAutomationtool";
//		String s3 = "velmurugan";
//		String s4 = "j a v a p r o g r a m";
//		String s5 = "9095484678";
//
//		System.out.println("S1:" + s1.length());
//		System.out.println("S2:" + s2.length());
//		System.out.println("S3:" + s3.length());
//		System.out.println("S4:" + s4.length());
//		System.out.println("S5:" + s5.length());
//
		// Sting Index

//		String s = "GreensTechnology";
//		System.out.println(s.lastIndexOf('o'));
//
//		String si = "SeleniumAutomationtool";
//		int indexOf2 = si.indexOf('o');
//		System.out.println(si.indexOf('o'));
//
//		String sv = "Velmurugan";
//		int indexOf3 = sv.indexOf('n');
//		System.out.println(indexOf3);
//
//		String sj = "j a v a p r o g r a m";
//		int lastIndexOf = sj.lastIndexOf(' ');
//		System.out.println(lastIndexOf);
//
//		String sn = "9095484678";
//		int indexOf4 = sn.indexOf('8');
//		System.out.println(indexOf4);
//
//********************************************************************************************
// Question 3:
// Find the particular character in the given string

		/*
		 * System.out.println("--------------------------------------------"); String
		 * sp1 = "GreensTechnology"; int indexOf = sp1.indexOf('h');
		 * System.out.println("char:" + sp1.charAt(indexOf) + " at Index:" + indexOf);
		 * 
		 * String sp2 = "SeleniumAutomationtool"; int indexOf2 = sp2.indexOf("o");
		 * System.out.println("Char:" + sp1.charAt(indexOf2) + " at index:" + indexOf2);
		 * 
		 * String sp3 = "velmurugan"; if (sp3.contains("u")) { int indexOf3 =
		 * sp3.indexOf('u'); System.out.println("Char:" + sp3.charAt(indexOf3) +
		 * " at index :" + indexOf3);
		 * 
		 * } String sp4 = "9095484678"; if (sp4.contains("7")) { int indexOf4 =
		 * sp4.indexOf("7"); System.out.println("Char:" + sp4.charAt(indexOf4) +
		 * " at index :" + indexOf4);
		 * 
		 * } System.out.println("--------------------------------------------");
		 */
//*******************************************************************************************
//Question 4:
//equals and equalsIgnoreCase in String

//		System.out.println("Enter String one:");
//		Scanner obj = new Scanner(System.in);
//
//		String nextLine = obj.nextLine();
//
//		System.out.println("Enter String Two:");
//		String nextLine2 = obj.nextLine();
//
//		if (nextLine.equals(nextLine2)) {
//			System.out.println("Strings are Equal!!!");
//		} else {
//			System.out.println("Strings are Not Equal");
//		}
//
//		System.out.println("---------------------------------------------");
//		System.out.println("Enter String 3:");
//		String nextLine3 = obj.nextLine();
//
//		System.out.println("Enter String 4:");
//		String nextLine4 = obj.nextLine();
//
//		if (nextLine3.equalsIgnoreCase(nextLine4)) {
//			System.out.println("Strings are Equal...");
//		} else {
//			System.out.println("Strings are Not Equal");
//		}
		System.out.println("---------------------------------------------");
//****************************************************************************************
//QUESTION 5 & 6
//matches using regular expression

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter youre Email ID:");

		String emailId = sobj.nextLine();
		if (emailId.contains("@")) {
			System.out.println("Valid Email Id");
		} else {
			System.out.println("Invalid Email Id");
		}

		System.out.println("------------------------------------------------");
		System.out.println("Enter youre Address with Pincode");
		String Address = sobj.nextLine();

		if (Address.contains("pincode")) {
			System.out.println("Valid Address");
		} else {
			System.out.println("Invalid Address");
		}
		System.out.println("-----------------------------------------------------");

		System.out.println("Enter Phone Number:");
		String mob = sobj.nextLine();
		// [0-9]+ => +indicates n number of digits
		if (mob.matches("[0-9]+") && mob.length() <= 10) {
			System.out.println("Valid Number");
		} else {
			System.out.println("Invalid Number");
		}
		System.out.println("-----------------------------------------------------");

		// QUESTION 7

		String rep = "Welcome to class java";
		String replace = rep.replace("java", "sql");
		System.out.println(rep + "--->" + replace);

		// QUESTION 7.3:
		String rep1 = "Welcome to java class";
		String replace2 = rep1.replace(' ', '#');
		System.out.println(rep1 + "--->" + replace2);

		// Q0UESTION 7.4:
		System.out.println("Enter your Gmail ID:");
		String gmail = sobj.nextLine();
		if (gmail.contains("gmail")) {
			String replace3 = gmail.replace("gmail", "yahoo");
			System.out.println(gmail + "-->" + replace3);

		} else {
			System.out.println("gmail not present in the given string");
		}

		sobj.close();
	}
}
