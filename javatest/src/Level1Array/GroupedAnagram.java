package Level1Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupedAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String[] s = {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> al = new ArrayList<>();
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String current : s) {
			
			char[] character = current.toCharArray();
		    Arrays.sort(character);
		    String sorted = new String(character);
		    
		    if(!map.containsKey(sorted)) {
		    	
		    	map.put(sorted, new ArrayList());
		    	
		    } 
		    map.get(sorted).add(current);
		    }
		
			al.addAll(map.values());
			
			
			System.out.println(al);

	}

}
