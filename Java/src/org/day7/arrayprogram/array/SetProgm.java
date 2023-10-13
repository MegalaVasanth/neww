package org.day7.arrayprogram.array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
// It won't Allow redundency / Duplicate Value
public class SetProgm {
	int id;
	String name;
	
	
	private void display( int id, String name) {
		System.out.println("ID:"+id+"Name:"+name);

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		SetProgm setprogm = new SetProgm();
		setprogm.display(100, "a");
		setprogm.display(102, "ab");
		SetProgm setprogm2 = new SetProgm();
		setprogm2.display(123, "sdfghj");
		//QUESTION 1.1
		HashSet hash = new HashSet();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(40);
		hash.add(50);
		hash.add(10);
		hash.add(60);
		
		hash.add(setprogm);
		
		//Using Iterator Class
		System.out.println("Values in HashSet:");
		Iterator<Integer> iterator = hash.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
//		//QUESTION 1.2
//		LinkedHashSet<String> linkset = new LinkedHashSet<String>();
//		linkset.add("megaa");
//		linkset.add("megaa");
//		linkset.add("eshwaa");
//		linkset.add("raj");
//		linkset.add("ravi");
//		linkset.add("moulee");
//		Iterator<String> itString = linkset.iterator();
//		System.out.println("Values in LinkedHashSet:");
//		while(itString.hasNext()) {
//			System.out.println(itString.next());
//		}
//		
//		LinkedHashSet<Integer> lhash = new LinkedHashSet<Integer>();
//		lhash.add(10);
//		lhash.add(20);
//		lhash.add(30);
//		lhash.add(40);
//		lhash.add(50);
//		lhash.add(10);
//		lhash.add(60);
//		System.out.println("Integer Values in LinkedHashSet:");
//		for (Integer integer : lhash) {
//			System.out.println(integer);
//			
//		}
//		
//		//QUESTION 1.3
//		System.out.println("----------------------------------------------");
//		TreeSet<Integer> treset = new TreeSet<Integer>();
//		treset.add(10);
//		treset.add(20);
//		treset.add(30);
//		treset.add(40);
//		treset.add(50);
//		treset.add(10);
//		treset.add(60);
//		System.out.println("Integer Values in TreeSet:");
//		for (Integer integer1 : treset) {
//			System.out.println(integer1);
//			
//		}
//		TreeSet<String> streset = new TreeSet<String>();
//		streset.add("megaa");
//		streset.add("megaa");
//		streset.add("eshwaa");
//		streset.add("raj");
//		streset.add("ravi");
//		streset.add("moulee");
//		Iterator<String> treString = streset.iterator();
//		System.out.println("String Values in TreeSet:");
//		while(treString.hasNext()) {
//			System.out.println(treString.next());
//		}
		
		
	}

}
