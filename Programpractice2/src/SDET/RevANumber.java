package SDET;

import java.util.Scanner;

public class RevANumber {

	public static void main(String[] args) {
		
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter a number boss");
	int Number = scr.nextInt();
	int copyForRefreance = Number;
	StringBuilder builder = new StringBuilder();
	builder.append(Number);
	
	/*
	while(Number != 0) {
		int rem = Number%10;
		builder.append(rem);
        Number = Number/10;
		
	}
	System.out.println(builder);
	*/
	
	// System.out.println(builder.reverse());
	
	String numInFormOfInt =  builder.reverse().toString();
	if(copyForRefreance == Integer.parseInt(numInFormOfInt) ) {
		System.out.println("It is palindrom number");
	
	
	}
	else {
		System.out.println("It is not palindrom number");
	}
}
}