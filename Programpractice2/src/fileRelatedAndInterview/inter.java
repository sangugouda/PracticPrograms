package fileRelatedAndInterview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//List = [10, 5, 30, 3, 7, 8, 9]
//		Hashmap = {'c':8, 'd':4, 'e':5, 'a':1}
//		Search the map for the list elements as values. If a match is found, then print the key.
		
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(5);
		list.add(8);
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(9);
		
		Map<String,Integer> map = new HashMap();
		map.put("c", 8);
		map.put("d", 4);
		map.put("e", 5);
		map.put("a", 1);
		
		
		/*	
		System.out.println(map);
	
		Set<String > keys = map.keySet();
		
		for(String key : keys) {
			
			for(int value : list ) {
				if(map.get(key).equals(value)) {
					System.out.println("Respective repetative Key is " + key);
					
				}
			}
			
		}
		*/
		
		ConvertingCollectionToArray();
		
	
	}

	
	public static void ConvertingCollectionToArray() {
		
		List<String> array = new ArrayList();
		
		array.add("Pushpa");
		array.add("Pratap");
		array.add("Sagar");
		array.add("Anuragh");
		array.add("Shirin");
		
		String [] arr = new String[array.size()];
		
		array.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
	
		
	}
}
