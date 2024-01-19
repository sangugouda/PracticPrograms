package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		Scanner scr = new  Scanner(System.in);
		
		System.out.println("Enter numbers");
		
		int [] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= scr.nextInt();

		}
		
		Arrays.sort(arr);
		
		for(int i= arr.length-1;i>=0;i--) {
			
			if(arr[i]!= arr[arr.length-1]) {
				System.out.println(arr[i]);
			     break;
			}
			
		}

	}

}
