package arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequencycount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	        int [] arr = {1,2,2,3,4,5,5,6};
	    HashMap<Integer,Integer> map = new HashMap();
	    
	    for(int i=0;i<arr.length;i++){
	        if(map.containsKey(arr[i])){
	        	map.put(arr[i],map.get(arr[i])+1);
	            
	        }
	        else {
	        	map.put(arr[i],1);
	        }
	    }
	    for(Map.Entry<Integer,Integer> e: map.entrySet()) {
	    	System.out.println(e.getKey() + " "+ e.getValue());
	    	
	    }
	    }
	
	

	

}
