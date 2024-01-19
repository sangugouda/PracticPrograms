package arrays;

import java.util.Arrays;

public class SortingArray {
	public static void main(String [] args) {
		
		int [] arr = {23,86,13,17,76,35};
		
		int firstLargestNumber = 1;
		int secondLargestNumber = 0;
		
		for(int number : arr) {
			if(number > firstLargestNumber) {
				secondLargestNumber = firstLargestNumber;
				firstLargestNumber = number;
			}
			else if(number > secondLargestNumber && number != firstLargestNumber ) {
				secondLargestNumber = number;
			}
		}
		
		System.out.println(firstLargestNumber);
		System.out.println(secondLargestNumber); 
		
		
//		Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));
//	System.out.println(arr[arr.length-2]);
		
		

	}

}
