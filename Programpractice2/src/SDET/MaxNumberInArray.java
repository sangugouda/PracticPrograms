package SDET;

import java.util.Scanner;

public class MaxNumberInArray {

	public static void main(String[] args) {
		
		System.out.println(maxNumberInArray());
		System.out.println(minNumberInArray());
	
	}

	static int maxNumberInArray() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a size of a array");
		int sizeOfanArray = scr.nextInt();
		
		int [] arr = new int[sizeOfanArray];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a" + i +" number");
			arr[i] = scr.nextInt();
			
		}
		int max = 0;
		for(int number : arr) {
			
			if(number > max) {
				max = number;
			}
		}
		
		return max;
		
	}
	
	static int minNumberInArray() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a size of a array");
		int sizeOfanArray = scr.nextInt();
		
		int [] arr = new int[sizeOfanArray];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a" + i +" number");
			arr[i] = scr.nextInt();
			
		}
		int min = arr[0];
		for(int number : arr) {
			
			if(number < min) {
				min = number;
			}
		}
		
		return min;
		
	}
}
