package stringRelatedPro;

import java.util.Arrays;

public class SortInAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Approch -1 
		String str = "gouda";
		char [] arr = str.toCharArray();
		
		char temp;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		// Approch -2
		String str2 = "gouda";
		char [] arr1 = str.toCharArray();
		
		Arrays.sort(arr1);
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i<arr1.length;i++) {
			builder.append(arr[i]);
		
			
		}
		
		System.out.println(builder);
		
		
		

	}

}
