package org.day7.arrayprogram.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListCls {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
//QUESTION 4.1
		List<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the count of  list , minimum 5:");
		int count = sobj.nextInt();

		System.out.println("Enter the list Items:");
		for (int i = 0; i < count; i++) {
			arr.add(sobj.nextInt());

		}
		System.out.println(arr);
		System.out.println("size:" + arr.size());
		
		// QUESTIO 5.1,5.2,53
		int indexOf = arr.indexOf(10);
		System.out.println("First index of 10:" + indexOf);
		int lastIndexOf = arr.lastIndexOf(20);
		System.out.println("Last Index value of 20:" + lastIndexOf);
		
		// QUESTION 5.5 & 5.6
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 20) {
				System.out.println("Indexes value of 20-->" + i);
			}

		}
		//QUESTION 6
		//QUESTION 6.1-6.3
		System.out.println("-------------------------------------------");
		System.out.println("Value present in 2 nd Index:"+arr.get(2));
		
		System.out.println("Value present in 4 nd Index:"+arr.get(4));
		System.out.println();
		//QUESTION 7.1,7.2
		System.out.println("Before Removing the Element:"+arr);
		System.out.println("removing Values in the 2 nd Index:"+ arr.remove(2));
		System.out.println("after Removing the Element:"+arr);
		
		System.out.println("before remove Last Index:"+arr);
		System.out.println(arr.remove(arr.lastIndexOf(20)));
		System.out.println("After LastIndex Removed:"+arr);
		System.out.println("------------------------------------------------");
		
		//QUESTION 8
		System.out.println("50 Element is added :");
		arr.add(2, 50);
		System.out.println(arr);
		//QUESTION 8.2
		System.out.println("element 70 is added at last index:");
		arr.add(arr.size(), 70);
		System.out.println(arr);
		//QUESTION 8.4
		int lastIndexOf10 = arr.lastIndexOf(10);
		arr.add(lastIndexOf10, 100);
		System.out.println(arr);
		
		//QUESTION 9
		//QUESTION 9.1,9.2,9.3
		System.out.println("------------------------------------------------------");
		arr.set(0, 0);
		System.out.println("Set Index zero:"+arr);
		
		arr.set(3, 30);
		System.out.println("Set index three:"+arr);
		
		
		//QUESTION 6.4
		System.out.println("----------For Loop---------------------");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i+" List Value:"+arr.get(i));
			
		}
		//QUESTION 6.5
		System.out.println("--------------For Each Loop-----------------------");
		for (Integer frlist : arr) {
			System.out.println(frlist);
			
		}
		//QUESTION 4.2
		LinkedList linkobj = new LinkedList();
		linkobj.add(1234);
		linkobj.add("how");
		linkobj.add("are");
		linkobj.add("you?");
		
		System.out.println("LinkedList:"+linkobj+"size: "+linkobj.size());
		
		//QUESTION 4.3
		Vector<Object> vec = new Vector<Object>();
		vec.add("one");
		vec.add("teo");
		vec.add(2345);
		vec.add(30);
		vec.add(0);
		
		System.out.println("Vector : "+ vec+"Size :"+vec.size());
		
		//QUESTION 10
				//QUESTION10.1
				System.out.println("-------------------------------------------------------");
				System.out.println(arr);
				System.out.println(vec);
				System.out.println("___________________________________");
				
				boolean retainAll = arr.retainAll(vec);
				System.out.println(arr);
		//QUESTION 11
				//QUESTION 11.1-11.3
				System.out.println("---------------------------------------------------");
				boolean removeAll = arr.removeAll(arr);
				System.out.println(arr);
		
	}


}
