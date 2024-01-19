package pratice1;

import java.util.Scanner;

public class Evennumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the start number");
		int start= sc.nextInt();
		System.out.println("enter the end number");
		 int end =sc.nextInt();
		 for(int i=start;i<=end;i++) {
			 if(i%2==0) {
				 System.out.println(i+" is even number");
			 }
			 else {
				 System.out.println(i+" is odd number");
			 }
		 }
	}

}
