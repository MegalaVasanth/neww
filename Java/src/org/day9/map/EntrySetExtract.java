package org.day9.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetExtract {
	public static void main(String[] args) {
		Map<Integer, String> mapobj = new HashMap<Integer, String>();
		mapobj.put(1, "one");
		mapobj.put(2, "two");
		
		List ls = new ArrayList();
		ls.add(mapobj);
		System.out.println(ls);
//		Set<Entry<Integer, String>> entrySet = mapobj.entrySet();
//		
//		for (Entry<Integer, String> entry : entrySet) {
//			ls.add(entry.getKey());
//			ls.add(entry.getValue());
//			System.out.println(ls);
//		}
	
		
		Set<Entry<Integer, String>> entrySet = mapobj.entrySet();
		//System.out.println(entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			ls.add(entry.getKey());
			ls.add(entry.getValue());
			System.out.println(ls);
		}
	
		
		
//		List l = new ArrayList<Map>();
//		l.add(mapobj);
//		l.add(1);
//		System.out.println(l);
//		for (Object object : l) {
//			System.out.println(object);
//			Class<? extends Object> class1 = object.getClass();
//			
//			
//		}
	}
	

}
