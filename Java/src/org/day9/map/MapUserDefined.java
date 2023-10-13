package org.day9.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUserDefined {
	
	public static void main(String[] args) {
		

		
		MapEncap mapencap = new MapEncap();
		
		mapencap.setId(101);
		mapencap.setName("vinothini");
		
		MapEncap mapencap1 = new MapEncap();
		
		mapencap1.setId(12);
		mapencap1.setName("vinothini1");
		
		
		
		Map<Integer, MapEncap> map = new HashMap<Integer, MapEncap>();
		map.put(1, mapencap);
		map.put(2, mapencap1);
		
		System.out.println(map);
		Set<Entry<Integer, MapEncap>> entrySet = map.entrySet();
		for (Entry<Integer, MapEncap> entry : entrySet) {
			
			//System.out.println(entry);
			System.out.println(entry.getKey()+"=ID:"+entry.getValue().getId()+" Name:"+entry.getValue().getName());
			
			
			
		}
		
	
}

}
