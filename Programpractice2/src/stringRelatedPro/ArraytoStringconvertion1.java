package stringRelatedPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraytoStringconvertion1 {

	public static void main(String[] args) {
	
	// convertingArraytoStringByUsingToStringmethod();
	 //  convertingArraytoStringByUsingStringBuilder();
	//	convertingArraytoStringByUsingjion();
	//	findingDublicatechartersingivenString();
	//	anagrams();
		// palindrome();
	//	removeCharfromString();
	//	removecharinstring();
	//	wordsinString();
		// revrsewordsinString();
		// swapTwoString();
	  
	  duplicateCharInUserInputString();
		
	}
	
	
	public static void convertingArraytoStringByUsingToStringmethod() {
		String [] arr = {"my","name","is","Gouda"};
		String result	= Arrays.toString(arr);
			System.out.println(result);
			}
	
	public static void convertingArraytoStringByUsingStringBuilder() {
		String [] arr = {"my","name","is","Gouda"};
		StringBuilder stringBuilder = new StringBuilder();
	   for(int i=0;i<arr.length;i++) {
		   
		   stringBuilder.append(" " +arr[i]);
	   }
	   System.out.println(stringBuilder);
	}
	
	
	public static void convertingArraytoStringByUsingjion() {
		String [] arr = {"my","name","is","Gouda"};
		String result = String.join(" ", arr);
		System.out.println(result);
		
	}
	
	public static void findingDublicatechartersingivenString() {
		String name = "my name is gouda";
		
		for(int i=0;i<name.length();i++) {
			int count = 0;
	     char letter = name.charAt(i);
	   
	    for(int j=0;j<name.length();j++) {
	    	char comareletter = name.charAt(j);
	    	  if (letter == comareletter) {
	    		  count++;
	    	  }
		  
	  }
	    if(count>1 && letter !=' '){
	    System.out.println(letter + " is present " + count);
	    }
		}
		
	}
	
	public static void anagrams() {
		String str1 = "Man";
		String str2 = "Amn";
		
		char [] arr1 = str1.toLowerCase().toCharArray();
		char [] arr2 = str2.toLowerCase().toCharArray();
		 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	System.out.println((Arrays.equals(arr1, arr2)));
	
	}
	
	public static void palindrome() {
		
		String word = "Gouda";
		String rev = "";
		
		/*for(int i=word.length()-1;i>=0;i--) {
		rev	=  rev + word.charAt(i);
			
		}*/
		StringBuilder obj = new StringBuilder();
	       obj.append(word);
		System.out.println(obj.reverse());
		
		/*if(rev.equalsIgnoreCase(word)) {
			System.out.println("given word is palendrom");
			
		}
		else {
			System.out.println("given word is not palendrom");
		}*/
	}
	
	public static void removeCharfromString() {
		String name = "Gouda";
		char charremove = 'd';
	char [] arr	= name.toCharArray();
	ArrayList<Character> obj = new ArrayList<Character>();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=charremove) {
			obj.add(arr[i]);
			
		}
		
	}
	for(int j=0;j<obj.size();j++) {
		System.out.print(obj.get(j));
		
	}
	}
	
	public static void removecharinstring() {
		String name = "Gouda";
		String charremove = "d";
	String result =	name.replace(charremove, "");
		System.out.println(result);
	}
	
	
	public static void wordsinString() {
		String name = "I am not a good person";
		String [] arr = name.split(" ");
		
		System.out.println(arr.length);
		
	/*	int count = 0;
		for(int i = 0;i<arr.length;i++) {
			count++;
			
		}
		System.out.println(count);  */
	}
	
	public static void revrsewordsinString(){
		String name = "Be good and do good";
		String [] arr= name.split(" ");
		
		StringBuilder obj = new StringBuilder();

		for(int i=0;i<arr.length;i++) {
			
			obj.append(arr[i]);
		      System.out.print(obj.reverse()+ " ");
		      obj.delete(0, arr[i].length());
			
		}
		
	}
	
	public static void swapTwoString() {
		String name1 = "Sangu";
		String name2 = "Gouda";
		int name1count	= name1.length();
		int name2count = name2.length();
		String var=" " ;
		
		name1=name1+name2;
	
		name2= name1.substring(0, name1.length()-name1count);
		name1=name1.substring(name1count, name1.length());
		
		System.out.println("the variable name2 stores "+ name2);
		
		System.out.println("the variable name1 stores "+ name1);
		
	// by using 3rd variable	
		/*var= name;
		name=name1;
		name1=var;
		System.out.println(name);
		System.out.println(name1);
		
		*/
		
		// escape char
		
		String val = "This is \"string\" class";
		System.out.println(val);
	}
	
	
	
	
	public static void duplicateCharInUserInputString() {
		
		Scanner scr = new Scanner(System.in);
	System.out.println("Please enter a string Gouda!");
		String str =scr.nextLine();
		
		for(int i=0;i<str.length();i++) {
			char comparingCh = str.charAt(i);
			int count = 1;
			for(int j=i+1;j<str.length();j++) {
				char refringCh = str.charAt(j);
				if(comparingCh ==refringCh && comparingCh != ' ' ) {
					count ++;
				}
			}
			
			if(count > 1) {
				System.out.println(comparingCh + "  "+ count);
			}
		}
		
	}

}
