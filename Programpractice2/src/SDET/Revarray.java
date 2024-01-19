package SDET;

import java.util.Scanner;

public class Revarray {
	static char [] arr ;
	
	public static void main(String[] args) {
		
		arrayMethod(arr);
		

	}
	
	public static void arrayMethod(char [] arr) {
		
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize = scr.nextInt();
		arr =  new char[arraySize];
		
		for(int i=0;i<arraySize;i++) {
			
			System.out.println("Enter digit for the" + i + " index char");
	          
			arr[i] = scr.next().charAt(0);
			
		}
		
		for(int i=arr.length-1; i>=0;i--) {
			System.out.println(arr[i]);
			
		}
	}

}
