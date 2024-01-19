package stringRelatedPro;

import java.util.Scanner;

public class ReverseEachWordofString {
	public static void main(String [] arr) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a sentance boss");
		String str = scr.nextLine();
		
		String [] strArray = str.split( " ");
		
		StringBuilder  build = new StringBuilder();
		for(String arrElement : strArray) {
			build.append(arrElement);
			System.out.print(build.reverse() + " ");
			build.delete(0,build.length());
		
		}
		
		
	}

}
