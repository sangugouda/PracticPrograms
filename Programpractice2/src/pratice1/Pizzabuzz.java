package pratice1;

import java.util.Scanner;

public class Pizzabuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int number =sc.nextInt();
		if(number%3==0 && number%5==0) {
			System.out.println("Goudru");
		}
		else if(number%3==0){
			System.out.println("sangu");
			
		}
		else if(number%5==0) {
			System.out.println("sanganagouda");
		}
		else {
			System.out.println("sangugouda");
			
		}
	}

}
