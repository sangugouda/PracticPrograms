	package Maps;

import java.util.HashMap;
import java.util.Map;

public class CountCharByusingMap {
	
	static void countingchart(String userName) {
		char [] arr = userName.toCharArray();
		
		Map<Character, Integer > map = new HashMap<>();
		
		for(char ch : arr) {
			int count = 1;
			if(map.containsKey(ch)) {
				map.put(ch, count+1);
				
			}
			else {
				map.put(ch, count);
			}
		}
		
		System.out.println(map);
	}

	public static void main(String[] args) {
		
		countingchart("Goudaa");
		
	}

}
