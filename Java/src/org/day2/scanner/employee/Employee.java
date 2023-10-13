package org.day2.scanner.employee;

import java.lang.*;
import java.util.Scanner;;

public class Employee {
public static void main(String[] args) {
	Scanner myobj  = new Scanner(System.in);
	System.out.println("Enter studentId:");
	int studentId = myobj.nextInt();
	
	myobj.nextLine();
	System.out.println("Enter studentName:");
	String studentName = myobj.nextLine();
	
	myobj.nextLine();
	System.out.println("Enter Mark1:");
	short Mark1 = myobj.nextShort();
	
	System.out.println("Enter Mark2:");
	short Mark2 = myobj.nextShort();
	
	System.out.println("Enter Mark3:");
	short Mark3 = myobj.nextShort();
	
	System.out.println("Enter Mark4:");
	short Mark4 = myobj.nextShort();
	
	System.out.println("Enter Mark5:");
	short Mark5 = myobj.nextShort();
	
	
	myobj.nextLine();
	
	int total = Mark1+Mark2+Mark3+Mark4+Mark5;
	float avg = total/5;
	
	System.out.println("studentId :"+studentId);
	System.out.println("studentName :"+studentName);
	System.out.println("Mark1 :"+Mark1);
	System.out.println("Mark2 :"+Mark2);
	System.out.println("Mark3 :"+Mark3);
	System.out.println("Mark4 :"+Mark4);
	System.out.println("Mark5 :"+Mark5);
	System.out.println("Total Mark:"+ total);
	System.out.println("Average Mark:"+avg);
	
	
}
}
