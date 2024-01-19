package arrays;

import java.util.Scanner;

public class CountingUpperCaseAndSmallerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  scr = new Scanner(System.in);
		System.out.println("Enter a sentance boss");
		String line = scr.nextLine();
		char [] arr = line.toCharArray();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for(char arrElement : arr) {
			
			if(Character.isLowerCase(arrElement)) {
				lowerCaseCount ++;
				
			}
			else if (!Character.isSpaceChar(arrElement)){
				upperCaseCount ++ ;
			}
		}
		
		System.out.println(upperCaseCount);
		System.out.println(lowerCaseCount);
		
	}

}
