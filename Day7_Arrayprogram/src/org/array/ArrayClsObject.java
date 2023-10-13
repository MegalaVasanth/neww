package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClsObject {
	String name;
	int id;
	ArrayClsObject(String namea, int ida){
		name=namea;
		id=ida;
		System.out.println("name:"+name+" id:"+id);
	}
	@Override
	public String toString() {
		return "Name:"+name+" ID:"+id;
	}
	
	public static void main(String[] args) {
		
		ArrayClsObject arr = new ArrayClsObject("megaa",1);
		ArrayClsObject arr1 = new ArrayClsObject("eshuu",1);
		ArrayClsObject arr2 = new ArrayClsObject("megaa",1);
		
		List<ArrayClsObject> obj = new ArrayList<ArrayClsObject>();
		obj.add(arr);
		obj.add(arr1);
		obj.add(arr2);
		System.out.print(obj);
	}
	
	

}
