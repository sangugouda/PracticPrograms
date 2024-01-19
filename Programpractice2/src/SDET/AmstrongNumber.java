package SDET;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String [] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a number Gouda");
		
		int no = scr.nextInt();
		
		if(amStrongNumberChecker(no)) {
			System.out.println("The user has passed number is an Amstrong number");
			
		}
		else {
			System.out.println("The user has passed number is Not  an Amstrong number");
		}
		 /*int copyOfNumber = no;
		int digitInNo = String.valueOf(no).length();
		int sum =0;
		while(no!=0) {
		int	rem = no%10;
		 sum =  sum + (int)(Math.pow(rem, digitInNo));
		 no = no/10;
		}
		
		System.out.println(sum);
		*/
	}

	
	public static boolean amStrongNumberChecker(int no ) {
		int copyOfNumber = no;
		// int digitInNo = String.valueOf(no).length();
		int sum =0;
		while(no!=0) {
		int	rem = no%10;
		 sum =  sum + (int)(Math.pow(rem, 3));
		 no = no/10;
		}
		
		if(copyOfNumber==sum) {
			return true;
		}
		return false;
	}
}
