package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lis =   new ArrayList();
		lis.add("z");
		lis.add("a");
		lis.add("u");
		lis.add("b");
		
		
		System.out.println("Before sorting");
			System.out.println(lis);
		
			for(String value : lis) {
				System.out.println(value);
			}
			

//			   Collections.sort(lis);
//			System.out.println("After sorting");
//			
//			for(String value2 : lis) {
//				System.out.println(value2);
//				
//			}
			
			
			System.out.println("After sorting");
			Collections.sort(lis, Collections.reverseOrder());
			
			
			for(String value2 : lis) {
				System.out.println(value2);
			
		
		
	}
			}
	}


