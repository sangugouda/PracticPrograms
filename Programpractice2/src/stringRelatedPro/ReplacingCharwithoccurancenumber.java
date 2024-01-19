package stringRelatedPro;

import java.util.Arrays;

public class ReplacingCharwithoccurancenumber {
	
	public static void main(String [] args) {
		String str = "OpenText";
		
		String lowerCase = str.toLowerCase();
		char [] arr = lowerCase.toCharArray();
		char searchingChar = 't';
		int count = 1;
		
		for(int i=0;i<arr.length;i++) {
			
		//	char ch = lowerCase.charAt(i);
			
			if(arr[i]==searchingChar) {
				arr[i] = String.valueOf(count).charAt(0);
				count++;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
