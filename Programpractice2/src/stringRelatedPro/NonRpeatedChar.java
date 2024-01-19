package stringRelatedPro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRpeatedChar {

	public static <Charecter> void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GooGa"; 
	//	Aproch -1
		char [] arr =  str.toCharArray();
		
//		for(int i=0;i<arr.length;i++) {
//			boolean flag = true;
//			for(int j=0;j<arr.length;j++) {
//				
//				if( i!=j && arr[i]==arr[j]) {
//					flag= false;
//					break;
//					
//				}
//				
//			}
//			
//			if(flag==true) {
//				System.out.println(arr[i]);
//			}
//			
//		}
		
		// Aproch -2 
		
		Map <Character,Integer> map = new HashMap<>();
		
		
		
		for(char ch : arr) {
			 int count =1;
			if(map.containsKey(ch)) {
				map.put(ch, count+1);
			}
			
			else {
				map.put(ch, count);
			}
		}

	Set<Character> set = map.keySet();
	for(char ch : set) {
		if(map.get(ch)==1) {
			System.out.println(ch);
		}
	
	}
	}
}
