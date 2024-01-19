package SDET;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a string1");
		String str1 = scr.nextLine().toLowerCase();
		System.out.println("Enter a string2");
		String str2 = scr.nextLine().toLowerCase();
		
		
		char [] str1Array = str1.toCharArray();
		Arrays.sort(str1Array);
		char [] str2Array = str2.toCharArray();
		Arrays.sort(str2Array);
		
		if(Arrays.equals(str1Array, str2Array)) {
			System.out.println("String is an Anagram");
		}
		else {
			System.out.println("String is not an Anagram");
		}
	}

}
