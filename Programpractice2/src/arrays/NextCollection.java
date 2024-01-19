package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NextCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String>  map = new HashMap<>();
		
		map.put("Taj mahal", "Agrha");
		map.put("apple", "2");
		map.put("banana", "Agrha");
		
		for(Map.Entry<String, String> e: map.entrySet()) {
			
			if(e.getKey().equalsIgnoreCase("Taj mahal")) {
				map.replace(e.getKey(), "Gouda");
			}
		}
		
		
		System.out.println(map + " "+ map.size());
		

}
}
