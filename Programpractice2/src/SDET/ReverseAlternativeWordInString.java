package SDET;

import java.util.Scanner;

public class ReverseAlternativeWordInString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a sentance Boss");
		
	//	ReverseAlternativeWordInString obj = new ReverseAlternativeWordInString();
		
		ReverseAlternativeWordInString(scr.nextLine());

	}
	
	static void ReverseAlternativeWordInString(String userInputString) {
		
		 StringBuilder builder = new StringBuilder();
		 
		 String [] arr = userInputString.split(" ");
		 
		 for(int i=0;i<arr.length; i++) {
			 
			 if(i%2==1) {
				 builder.append(arr[i]);
				 System.out.print( builder.reverse()+ " ");
				 builder.delete(0, builder.length());
			 }
			 else {
				 System.out.print(arr[i] +" ");
			 }
			 
		 }
			
		}
}
