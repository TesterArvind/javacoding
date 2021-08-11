package javatesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String > map = new HashMap<>();
		map.put("one", "ok");
		map.put("tne", "ok");
		map.put("dne", "ob");
		map.put("mk", "oh");
		map.put("nm", "ok");
		
		System.out.println(map);
		
		for(Entry<String,String> ent: map.entrySet()) {
			System.out.println(ent.getKey()+" " +ent.getValue());
			
		}

	}

}
