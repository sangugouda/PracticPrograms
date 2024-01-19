package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsOfItratingMaps {
	public static void main(String []args) {
		
		Map<String,String> map = new HashMap();
		   map.put("V ", " Violet");
		   map.put("I ", " Indigo");
		   map.put("B ", " Blue");
		   map.put("G ", " Green");
		   map.put("Y ", " Yellow");
		   map.put("O ", " Orange");
		   map.put("R ", " Red");
		   
		   map.forEach((k,v)->System.out.println(k + " " + v));
		   
		   // Itarate through map Method-1
		    Iterator<Entry<String,String>> it = map.entrySet().iterator();
		   
		    //  To print Whole object 
	   
		    /* while(it.hasNext()){ 
			 Object obj = it.next();
			 System.out.println(obj);
			   
		   }
		   */
	   
	   
	   					//  To print Keys
	   
	 /*  Iterator<String> set = map.keySet().iterator();
		   
		  while(set.hasNext()) {
			String key =  set.next();
			System.out.println(map.get(key));
			  
		  }
		  */
		   
	   				//  To print Values
	   
	  /* Iterator<String> values =  map.values().iterator();
	   
	   while(values.hasNext()) {
		 String  Value = values.next();
		 System.out.println(Value);
		 
	   }
	   
	   */
	   
		    		// remove entry from Map by using key
	    /* 
	    Iterator<String> KeySet =  map.keySet().iterator();
	    while(KeySet.hasNext()) {
	    	 if(KeySet.next().equalsIgnoreCase("B ")) {
	    		 KeySet.remove();
				 break;
				 }
		
		 
	   }
	    */
	 
		    // remove entry from Map by using value
		    
	/*
	    Iterator<String> values =  map.values().iterator();
	    while(values.hasNext()) {
	    if(values.next().equalsIgnoreCase(" Blue")) {
				 values.remove();
				 break;
				 }
	   
		   }
	    	for(Map.Entry<String, String> objectSet: map.entrySet()){
			
			System.out.println(objectSet.getKey() + " " +objectSet.getValue() );
		   }
		*/
	
		    	
	}
		
	}


