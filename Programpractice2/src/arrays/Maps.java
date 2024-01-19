package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map = new HashMap<>();
		
		map.put("1", "one");
 
		map.put("2", "two");
		
		map.put("3", "three");
		
		map.put("4", "four");
		
		map.put("5", "five");
		
	// iterates through iterator	
		
//		Set<String> keySet = map.keySet();
//		
//		Iterator<String> it = keySet.iterator();
//		
//		while(it.hasNext()) {
//		String key	= it.next();
//		System.out.println(key + " " + map.get(key));
//			
//		}
		
		
		// iterates through Entry set	
		
		
//		for( Map.Entry<String, String> e : map.entrySet()) {
//			
//			
//			System.out.println(e.getKey() + " " + e.getValue());
//			
//		}
//		
		
		// iterates through Entry set & Iterator
		
	Set<Map.Entry<String, String>>	e = map.entrySet();
	Iterator<Map.Entry<String, String>> it = e.iterator();
	
	while(it.hasNext()) {
		
		Map.Entry<String, String> m= it.next();
		
		System.out.println(m.getKey() +" "+m.getValue() );
	}
	
		
	
	}

}
