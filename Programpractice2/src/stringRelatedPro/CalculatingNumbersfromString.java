package stringRelatedPro;

import java.util.Arrays;

public class CalculatingNumbersfromString {
	public static void main(String [] args) {
		
		String str = "Hi buddy I am gouda 45 but your are not ready 54 for me ";
		
		String [] arr = str.split(" ");
		
		int count =0;
		for(String word : arr) {
			if(Character.isDigit(word.charAt(0))) {
			int number	= Integer.parseInt(word);
			   count = count + number;
				
			}
			
		}
		System.out.println(count);
		
		
		
		String str2 = "Hi buddy I am gouda 45 but your are not ready 54 for me ";
		
		String modifiedString = str2.replaceAll("[A-Za-z]", "").trim();
		String [] arr2 = modifiedString.split(" ");
		System.out.println(Arrays.toString(arr2));
		int totalCount = 0;
		for(String word : arr2) {
			if(!Character.isSpaceChar(word.charAt(0))) {
				
			int no = Integer.parseInt(word);
			totalCount = totalCount + no;
			
			}
		}
		
		System.out.println(totalCount);
		
	}

}
