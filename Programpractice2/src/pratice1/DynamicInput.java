package pratice1;

import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range");
		int start = sc.nextInt();
		System.out.println("Enater end number");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			System.out.println("the number is "+ i);
		}
		
		
	}

}
