package pratice1;

import java.util.Scanner;

public class Oddnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the number");
		int number= sc.nextInt();
		if(number%2==1) {
			System.out.println(number + " is odd number");
		}
		else {
			System.out.println(number+" is even number");
		}

	}

}
