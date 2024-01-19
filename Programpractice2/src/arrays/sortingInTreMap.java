package arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class sortingInTreMap {

	public static void main(String[] args) {
		
		  // Creating a HashMap of int keys and String values
	    HashMap<Integer,String> hashmap = new HashMap();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	    
	    
	    
	    
	    
	System.out.println("Before sorting");
	Set set = hashmap.entrySet();
	Iterator it   = set.iterator();
	while(it.hasNext()) {
	Map.Entry<Integer,String> e = (Entry<Integer, String>) it.next();
	System.out.println(e.getKey() + " " + e.getValue());	
	}
	
	
	
	
	System.out.println("After Sorting");
	 Map<Integer,String> tmap = new TreeMap(hashmap);
	 
	 Set keyset = tmap.keySet();
	 for(Object keys : keyset) {
		 System.out.println(keys + ":" +tmap.get(keys));
		 
	 }
	 
//	 System.out.println("After Sorting");
//	 Set set2 = tmap.entrySet();
//	 Iterator it2 = set2.iterator();
//	 while(it2.hasNext()) {
//		Map.Entry e2 = (Entry) it2.next();
//		System.out.println(e2.getKey() + ":" + e2.getValue());
//		 
//	 }
	 
	
	
	
//	    
//	    // keys
//	    for(Object key : hashmap.keySet()) {
//	    	System.out.println(key + ":" + hashmap.get(key));
//	    	
//	    }
//	    
//	    // Values 
//	    
//	    for(Object value : hashmap.values()) {
//	    	System.out.println(value);
//	    	
//	    }   
	    
//	    Set set = hashmap.keySet();
//	 Iterator it  =  set.iterator();
//	 while(it.hasNext()) {
//	Object	key = it.next();
//	
//	System.out.println(key);
//		 
//	 }
	    
//	    Collection set = hashmap.values();
//		 Iterator it  =  set.iterator();
//		 while(it.hasNext()) {
//		Object	value = it.next();
//		
//		System.out.println(value);
//			 
//		 }
	    
	    
	    
	    
	    
	    
	    
	}
}

	 
	   
	
		

	


