package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scr = new Scanner(System.in);
		System.out.println("Enter a sentance boss");
		String line = scr.nextLine();
		
		
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<line.length();i++) {
			int count = 1;
			 if(map.containsKey(line.charAt(i))) {
				map.put(line.charAt(i), ++count); 
			 }
			 else {
				 map.put(line.charAt(i), count); 
			 }
			
		}
		
		for(Map.Entry<Character,Integer> set : map.entrySet()) {
			System.out.println(set.getKey() + " = " + set.getValue() );
			
		}
		
		
		
		

	}

}
