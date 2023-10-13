package org.day9.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapCls {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10, "java");
		hm.put(20, "sql");
		hm.put(30, "oops");
		hm.put(40, "Sql");
		hm.put(50, "Db");
		hm.put(60, "psql");
		hm.put(10, "hadoop");
		hm.put(80, "DB");
		System.out.println(hm);
		System.out.println("");

		Set<Integer> keySet = hm.keySet();
		System.out.println("HashMap Keys:" + keySet);
		System.out.println("HashMap Values:" + hm.values());

		System.out.println("----------For Each Loop----------------");
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey());
			System.out.print(" " + entry.getValue() + "\n");
		}
		System.out.println("---------------------------------------------");

		Map<Integer, Boolean> lhm = new LinkedHashMap<Integer, Boolean>();

		lhm.put(2, true);
		lhm.put(3, false);
		lhm.put(4, false);
		lhm.put(5, true);
		lhm.put(6, false);
		lhm.put(1, false);
		lhm.put(8, true);
		System.out.println(lhm);
		System.out.println("");

		System.out.println("LinkedHashMap Keys:" + lhm.keySet());
		System.out.println("LinkedHashMap values:" + lhm.values());
		System.out.println("----------For Each Loop----------------");
		Set<Entry<Integer, Boolean>> entrySet4 = lhm.entrySet();
		for (Entry<Integer, Boolean> entrylhm : entrySet4) {
			System.out.print(entrylhm.getKey());
			System.out.print(" " + entrylhm.getValue() + "\n");
		}
		System.out.println("---------------------------------------------");

		Map<Character, Integer> thm = new TreeMap<Character, Integer>();
		thm.put('!', 1);
		thm.put('@', 2);
		thm.put('#', 3);
		thm.put('$', 4);
		thm.put('%', 5);
		thm.put('^', 6);
		thm.put('&', 7);
		System.out.println(thm);
		System.out.println("");

		System.out.println("TreeMap keys:" + thm.keySet());
		System.out.println("TreeMap Values:" + thm.values());
		System.out.println("----------For Each Loop----------------");
		Set<Entry<Character, Integer>> entrySet3 = thm.entrySet();
		for (Entry<Character, Integer> entry : entrySet3) {
			System.out.print(entry.getKey());
			System.out.print(" " + entry.getValue() + "\n");
		}
		System.out.println("---------------------------------------------");

		Map<String, String> ht = new HashMap<String, String>();
		ht.put("vel", "selenium");
		ht.put("ganesh", "framework");
		ht.put("meg", "java");
		ht.put("ram", "jira");
		System.out.println(ht);
		System.out.println("");

		System.out.println("HashMap keys:" + ht.keySet());
		System.out.println("HashMap Values:" + ht.values());
		System.out.println("----------For Each Loop----------------");
		Set<Entry<String, String>> entrySet2 = ht.entrySet();
		for (Entry<String, String> entry : entrySet2) {
			System.out.print(entry.getKey());
			System.out.print(" " + entry.getValue() + "\n");
		}

		System.out.println("*************************************************");
		ArrayList lst = new ArrayList<Integer>();
		lst.add(100);
		lst.add(2);
		lst.add("hi");

		System.out.println(lst);
		
		Map<String, ArrayList<Integer>> obj = new HashMap<String, ArrayList<Integer>>();
		obj.put("one", lst);
		System.out.println(obj);


		Set<Entry<String, ArrayList<Integer>>> entrySet5 = obj.entrySet();
		for (Entry<String, ArrayList<Integer>> entry : entrySet5) {
			System.out.print(entry.getKey() + " ");
			System.out.print(entry.getValue() + "\n");

		}

		System.out.println("*****************************************************");
		Map<String, Map<String, String>> hsobj = new HashMap<String, Map<String, String>>();
		hsobj.put("Two", ht);
		System.out.println(hsobj);

	}
}
