package org.defalt;

public interface ADefault {
	// Using "default" Access specifier we can create  method with business Logic 
	default void print() {
		
		System.out.println(" Default data same class");
	}
 public static void main(String[] args) {
	ADefault aobj = new ADefault(); {
	};
}
}
