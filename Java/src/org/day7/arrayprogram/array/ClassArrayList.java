package org.day7.arrayprogram.array;
import java.util.*;


public class ClassArrayList {
	
	    String name;
	    int balance;
	    int id;

	    //Costructor 
	    ClassArrayList (String s, int i, int j)
	    {
	        name = s;
	        balance = i;
	        id = j;
	    }
	    //Every class in Java has the toString() method in it by default,
	    //which is called if you pass some object of that class to System.out.println().
	    //By default, this call returns the className@hashcode of that object.
	    //toString() method is overridden to give a meaningful String representaion of each object.
	
	public String toString () { 
		return "Name : " + name + "|Balance : " + balance
	+ "|ID : " + id; }
	
	    public static void main (String args[])
	    {
	        // ArrayList will contain a collection of Customer's objects.
	        ArrayList < ClassArrayList > arr = new ArrayList < ClassArrayList > (); 
	        
	        //Creating Customer objects.
	        ClassArrayList customer1 = new ClassArrayList ("Jay", 1000, 2);
	        ClassArrayList customer2 = new ClassArrayList ("Shane", 7000, 3);
	        ClassArrayList customer3 = new ClassArrayList ("Ricky", 5000, 1);
	        ClassArrayList customer4 = new ClassArrayList ("Tom", 3000, 6);
	        ClassArrayList customer5 = new ClassArrayList ("Mick", 6000, 4);

	        //Storing objects in an ArrayList collection class.
	        arr.add (customer1);
	        arr.add (customer2);
	        arr.add (customer3);
	        arr.add (customer4);
	        arr.add (customer5);

	        for (ClassArrayList c:arr)
	        	System.out.println (c);
	        	System.out.println(customer1);
	        
	    }
	}



