package arrays;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



public class Rev {

	public static void main(String[] args) throws IOException {
	
		
		
		// reverse a word
		
//		StringBuilder builder = new StringBuilder();
//		builder.append(word);
//		builder.append("Bhavikatti");
//		builder.reverse();
//		System.out.println(builder);
		
		
		
		
		// checked given word has Vowel 
		
//		
//		char [] arr = word.toLowerCase().toCharArray();
//		
//		
//		for(char ch : arr) {
//			
//			if(ch == 'i' || ch == 'o' || ch == 'e' || ch == 'a' || ch == 'u' ) {
//				
//				System.out.println(ch + " is a vowel");
//				
//			}
//		}
		
		
		// prime number

//		int no = 37;
//		
//		boolean flag = true;
//		
//		int div = 2;
//		while(div <= no/2) {
//			
//			if(no%div++ == 0) {
//				value = false;
//				break;
//			}	
//		}
//		
//		if(value==true) {
//			System.out.println(no +" is prime number");
//		}
//		else {
//			System.out.println(no +" is not prime number");
//		}
//		
		
		// counting No.of words in User input
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter sentance here");
//	
//		String word	= scr.nextLine();
//	
//		String [] words= word.split(" ");
//		
//		int count = 0;
//		
//		for(String w : words) {
//		 count ++;
//			
//		}
//		System.out.println(count);
		
		
		//Finding frequency of same words in userInput
		
//		Scanner scr = new Scanner(System.in) ;
//		System.out.println("Enter input text to program");
//		String word = scr.nextLine();
//		String [] arr =  word.split(" ");
//		
//		Map<String, Integer> map = new HashMap();
//		
//		for(String ele: arr) {
//			int count = 1;
//			 if(map.containsKey(ele)) {
//				 count++;
//				 map.put(ele, count);
//				 
//			 }
//			 
//			 else {
//				 map.put(ele, count);
//				 
//			 }
//			
//		}
//		
//		System.out.println(map);
		
		
		
		
		/////Finding frequency of same words in List
		
		
//		List<String> list = new ArrayList();
//		list.add("Gouda");
//		list.add("Basu");
//		list.add("Gouda");
//		list.add("Ashok");
//		list.add("Swami");
//		list.add("Kotresh");
//		
//		
//		Map<String, Integer> map = new LinkedHashMap();
//		
//		for(int i=0;i<list.size();i++) {
//			int count = 1;
//			
//			if(map.containsKey(list.get(i))) {
//				count++;
//				map.put(list.get(i), count);
//				
//			}
//			else {
//				map.put(list.get(i), count);
//			}
//			
//		}
//		
//		for(Map.Entry<String, Integer> ele :map.entrySet()) {
//			System.out.println(ele.getKey() + ":" + ele.getValue());
//			
//		}
		
		
		// Getting multiple input from User & storing them into an array 
		
//		Scanner scr = new Scanner(System.in);
//		
//		String [] arr = new String[5];
//		
//		for(int i=0;i<arr.length;i++) {
//		System.out.println("Enter a " +  i + " word");
//			arr[i] = scr.next();
//		}
//	
//		for(String word: arr) {
//			System.out.println(word);
//			
//		}
		
		
		
		// Find occurantion of each number in array 
		
		
//		int [] arr = {1,2,3,4,4,5,1,6,7,8,1};
//		
//		
//		for(int i = 0;i<arr.length;i++) {
//			int count = 1;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//					
//				}
//				
//			}
//			if(count>1) {
//				System.out.println(arr[i] + " has occured " + count + " in an array");
//			}
//			
//		}
	
	
		// find the occurantion of each char in array
		
//		String str = "Basamma";
//		char [] arr = str.toCharArray();
//	
//		for(int i=0;i<arr.length;i++) {
//			int count = 1;
//				
//			for(int j= i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j] && arr[i]!='$') {
//					arr[j]='$';
//					count++;
//					
//				}
//				
//			}
//			if(!(arr[i]=='$')) {
//			System.out.println(arr[i] + " has occured " + count + " times");
//			}
//			
//		}
		
		
			// Fibonici series
		
//		int a = 1;
//		int b = 2;
//		int c = 0 ;
//		int macCount = 50;
//		System.out.print(a + "," + b + ",");
//		while (c <= macCount ) {
//		 c = a+b; 
//		System.out.print(c + ",");
//			a=b;
//			b=c;
//		
//		}
		
		// swaping two number by divide rule 
//		int a=2;	
//		int b=3;
//		
//		 a = a*b; // a=6
//		 b = a/b; // b= 6/3=2 
//		 a=a/b; // a= 6/2 = 3
//		 
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
		
		
			// rev number
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter a number"); 
//		int no = scr.nextInt();
//		StringBuilder rev = null;
//		
////		while(no!=0) {
////			int rem =no%10;
////			 rev = rev*10+rem ;
////			no= no/10;
////			
////		}
//		
//		StringBuilder build = new StringBuilder();
//		
////		build.append("Gouda");
//		
//	
//		while(no!=0) {
//			int rem =no%10;
//			rev= build.append(rem);
//			no= no/10;
//			
//		}
//		
//		System.out.println(build);
		
		
		
			//rev by using String builder class
		
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter a number"); 
//		
//		int no = scr.nextInt();
//		
//		StringBuilder build = new StringBuilder(Integer.toString(no));
//		
////		StringBuffer buffer = new StringBuffer(Integer.toString(no));
//		
//		
//		System.out.println(build.reverse());
		
		
			//checking Palendrom of number
		
//		Scanner scr= new Scanner(System.in);
//		System.out.println("Enter a Number boss :");
//		
//		int no = scr.nextInt();
//		int copyOfNumber = no;
//		    int rev = 0;
//		while(no!=0) {
//			
//		int rem = no%10;
//		rev= rev*10 + rem;
//		no=no/10;
//		
//		}
//		
//		if(copyOfNumber==rev) {
//			System.out.println("Given Number: " + copyOfNumber + " is Palendrom" +  " and rev number is " + rev);
//		}
//		 
//		else {
//			System.out.println("Given Number: " + copyOfNumber + " is not Palendrom" + " and rev number is " + rev);
//				
//		}
//		
			
			//checking Palendrom of number
		
//		Scanner scr= new Scanner(System.in);
//		System.out.println("Enter a Number boss :");
//		
//		int no = scr.nextInt();
//		String copyOfNumberToString = Integer.toString(no);
//		
//		StringBuilder build = new StringBuilder();
//		build.append(copyOfNumberToString);
//		StringBuilder rev = build.reverse();
//		
//		
//		if(copyOfNumberToString.equals(rev.toString())) {
//			
//			System.out.println("Given Number: " + copyOfNumberToString + " is Palendrom" +  " and rev number is " + rev);
//		}
//		
//		else {
//			System.out.println("Given Number: " + copyOfNumberToString + " is not Palendrom" + " and rev number is " + rev);
//		}
//		
		
		
				// count no of digit in NUmber
//		
//		Scanner scr= new Scanner(System.in);
//		System.out.println("Enter a Number boss :");
//		
//		int no = scr.nextInt();
//		int count = 0;
//		
//		while(no!=0) {
//			no = no/10;
//			count ++;
//			
//		}
//		
//		System.out.println("Number digits in given number is : " + count);
		
		
			// count no. of even & odd digits in number
		
//		Scanner scr= new Scanner(System.in);
//		System.out.println("Enter a Number boss :");
//
//		int no = scr.nextInt();
//		
//		int evencount = 0;
//		int oddcount = 0;
//		
//		while(no!=0) {
//			int rem = no%10;
//			if(rem%2==0) {
//				evencount++;
//				
//			}
//			else {
//				oddcount++;
//			}
//			no=no/10;
//		}
//		
//		System.out.println("No of even digit in Number is : " + evencount + " No of odd digit in Number is : " + oddcount);
		
		
		
			// count sum of digits in given number
//	Scanner scr= new Scanner(System.in);
//	System.out.println("Enter a Number boss :");
//
//		int no = scr.nextInt();
//
//	    int sum = 0;
//
//		while(no!=0) {
//		int rem = no%10;
//		sum = sum+rem;
//		no= no/10;
//		}
//		
//		System.out.println("Sum of digits in given number is:" + sum );
		
		
				// largest number in given numbers
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter 1st number boss : ");
//		int a = scr.nextInt();
//		System.out.println("Enter 2nd number boss : ");
//		int b =scr.nextInt();
//		System.out.println("Enter 3rd number boss : ");
//		int c =scr.nextInt();
//		
//		if(a>b){
//			
//			if(a>c) {
//				System.out.println("a is largest number : " + a);
//			}
//			
//		}
//		
//		else if(b>c) {
//			System.out.println("b is largest number : " + b);
//			
//		}
//		
//		else {
//			System.out.println("c is largest number : " + c);
//		}
		
//		if(a>b && a>c) {
//			System.out.println(a + " is largest number");
//		}
//		
//		else if (b>c && b>a) {
//			System.out.println(b + " is largest number");
//		}
//		
//		else {
//			System.out.println(c + " is largest number");
//		}
		
//		int largest = a>b?a:b;
//		
//		largest=largest>c?largest :c;
//		
//		System.out.println(largest + " is largest number among given 3");
		
		
		
		
					//Prime Number
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter number boss : ");
//		int no = scr.nextInt();
//		
//		int i=2;
//		boolean flag = true;
//		while(i<=no/2) {
//			
//			if(no%i==0) {
//				flag = false;
//				break;
//				
//			}
//			
//			
//			i++;
//			
//		}
//		
//		if(flag==true) {
//			System.out.println("Given " + no + " is Prime number");
//		}
//		else {
//			System.out.println("Given " + no + " is not Prime number");
//		}
//		
		
		
		
				// Random String Generation & Random Number generation 
		
		
//		Random ran = new Random();
//		
//		System.out.println((ran.nextInt(6)));
		
//		System.out.println(randomString(3));
		
		
		// Factorial Number
		
		
//		int no = 5;
//		
//		for(int j=1;j<=10;j++) {
//			int fact =1;
//		for(int i=j;i>0;i--) {
//			
//			fact= fact*i;	
//			
//		}
//		System.out.println("Factorial of " + j + " is a " + fact);
//		}
		
		
					// sum of digits count in the array
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter the numbers boss : ");
//		
//		int arraynumbers = 0;
//		
//		int sum = 0;
//		
//		while(arraynumbers < 5) {
//			
//			int []  arr = {scr.nextInt()};
//			arraynumbers ++;
//			
//			sum = sum + arr[0];
//			
//			
//		}
//		
//		System.out.println("Sum of above input array is " + sum);
		
		
		
		
		      // Two arrays are equals 
		
		
//		int [] arr = {66,77,88,99,36,77,89,76,78};
//		
//		int [] arr2 = {77,66,88,78,36,77,89,76,1};
//		
//		if(arr.length==arr2.length){
//			boolean mainFlag  = false;
//			for(int valueOfArray1 :arr) {
//				boolean flag = false;
//				for(int valueOfArray2 :arr2) {
//					if(valueOfArray1==valueOfArray2) {
//						flag= true;
//						}	
//					
//				}
//				if(!(flag==true)) {
//					System.out.println("Both arrys are not equals because " + valueOfArray1 + " not present in arr2");
//					mainFlag = true;
//					break;
//					
//				}
//				
//			}
//			
//			if( mainFlag==false) {
//				System.out.println("Both are equals");
//				
//			}
//			
//			
//		}
//		
//		else {
//			System.out.println("Both arrays are not equals beause length of both are different");
//		}
//	
//		
//		System.out.println(Arrays.equals(arr, arr2));
		
		
		// Maxium number in array 
//		
//		int [] arr = {66,77,88,99,36,77,89,76,78,104};
//		
//		int max = 0;
//		
//		for(int numberOfArray : arr){
//			
//			if(numberOfArray>max) {
//				max = numberOfArray;
//				
//			}
//			
//		}
//		
//		System.out.println("Maxium number of Array is " + max);
		
		
		
//		// Min number in array 
//		
//int [] arr2 = {66,77,88,99,36,77,89,76,12,104};
//		
//		int min = arr2[0];
//		
//		for(int numberOfArray : arr2){
//			
//			if(numberOfArray<min) {
//				min = numberOfArray;
//				
//			}
//			
//		}
//		
//		System.out.println("Minium number of Array is " + min);
		
		
		   // Find Duplicates in Array-1
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter the elements Boss :");
//		String [] arr = new String[5];
//		int index = 0;
//		while(index < 5) {
//			arr[index] = scr.next();
//			 index++;
//			
//		}
//		
//		boolean flag = false;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i].equals(arr[j])) {
//					flag = true;
//					System.out.println("Found duplicate " + arr[i] + " in Array");
//					
//					
//				}
//				
//			}
//			
//		
//			
//		}
//		
//		if(flag==false) {
//
//		System.out.println("has all unique elements in array");
//		
//		}
		
				// Find Duplicates in Array-2
		
//			Scanner scr = new Scanner(System.in);
//			System.out.println("Enter the elements Boss :");
//			String[] arr = new String[5];
//			int index = 0;
//			while (index < 5) {
//				arr[index] = scr.next();
//				index++;
//
//			}
//			
//			
//			HashSet<String> set = new HashSet();
//			
//			boolean flag = false;
//			
//			for(String element : arr) {
//				if(set.add(element)==false) {
//					flag = true;
//					System.out.println("Array has duplicates that is : " + element);
//					
//					
//					
//				}
//			}
//			
//			if( flag == false) {
//				System.out.println("Array has all unique elements");
//			}
		
		
		
		
		
		 		// Binary search 
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter the numbiers boss : ");
//		int [] arr = new int[5];
//		int searchKey = 10;
//		int index= 0;
//		while(index <arr.length){
//			arr[index] = scr.nextInt();
//			index ++;	
//		}
//		
//		Arrays.sort(arr);
//		
//		for(int i =0;i<arr.length;i++) {
//			System.out.println(arr[i]);	
//		}
//		int keyIndex = Arrays.binarySearch(arr, 0, arr.length-1, searchKey);
//		System.out.println(keyIndex);
//		if(keyIndex >0 && keyIndex<=arr.length-1) {
//		System.out.println("Found a number in Array");
//		}
//		else {
//		System.out.println("Not found a number in Array");
//		}
		
		
				// Bubble Sort 
//		int [] arr = {34,16,7,78,96,104,86,2,3};
//		
//		System.out.println("Before sorting the array : " + Arrays.toString(arr));
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=0;j<arr.length-1;j++) {
//				
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] =temp;
//					
//				}
//				
//			}
//			
//		}
//		
//		System.out.println("Before sorting the array : " + Arrays.toString(arr));
		
		
//		String name = "I !@#$%^ am !@#$%^ Gouda";
//	
//		System.out.println("Before removing special chars : "+ name);
//		
//		name= name.replaceAll(" ", "");
//		
//		System.out.println("After removing special chars : "+ name);
//		
		
		
				// To find numner of e char in given string-1
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter a char a boss : ");
//		char searchCh=scr.next().charAt(0);
//		String str = "Be good and do Good don't be greedy";
//		str= str.toLowerCase();
//		String [] arr = str.split(" ");
//		int countch =0;
//		for(String strng : arr) {
//			
//			char [] ch = strng.toCharArray();
//			
//			for(char arrch : ch){
//				if(arrch==searchCh) {
//					
//					countch++;
//				}
//				
//			}
//			
//			
//		}
//		System.out.println("Char " + searchCh + " exist " + countch + " times in Given string");
//		
		
				// To find numner of e char in given string-1
		
//		String str = "Be good and do Good don't be greedye";
//		str= str.toLowerCase();
//		String [] arr = str.split(" ");
//		int count =0;
//		for(String strng : arr) {
//			char [] ch = strng.toCharArray();
//			
//				int index = Arrays.binarySearch(ch, 'e');
//				
//				if(index>0 && index <=ch.length) {
//					count++;	
//				}
//			
//			
//		}
//		
//		System.out.println("Char E exist " + count + " times in Given string");
		
		
		
		
		 // To find numner of e char in given string-3
		
//		String str = "Be good and do Good don't be greedy";
//		str= str.toLowerCase();
//		int originalLength = str.length();
//		String str1= str.replace("o", "");
//		int afterReplacedLength = str1.length();
//		System.out.println("No of time o occured in string is : " + (originalLength-afterReplacedLength));
//		
		
		
		
		
		// Reverse each word in Given user input 
		
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter the string boss : ");
//		String str = scr.nextLine();
//		String [] arr= str.split(" ");
//		
//		System.out.println("Before rev of string of each word : " + Arrays.toString(arr));
//		System.out.println("Before rev of string of each word : " + str );
//		
//		String revstring = "";
////		
////		for(int i=0;i<arr.length;i++) {
////			
////			String word = arr[i];
////			
//////			char [] ch = word.toCharArray();
////			
////			String rev = "";
////			
////			for(int j=word.length()-1;j>=0;j--) {
////				rev = rev + word.charAt(j);
////				
////			}
////			
////			revstring = revstring + rev + " ";
////			arr[i] = rev;
////			
////		}
////		
////		System.out.println("After rev of string of each word : " + revstring );
////		System.out.println("After rev of string of each word : " + Arrays.toString(arr));
//		
//		StringBuilder builder = new StringBuilder();
//		 
//		
//		
////		for(String ele :arr) {
////			builder.append(ele);
////			String rev= builder.reverse().toString();
////			revstring	= revstring + rev + " ";
////			
////		}
//		
//		System.out.println(builder.append(str).reverse());
		
		
		
		
		   // Read data from text file C:\Users\User\Downloads\Gouda.txt
		
//		
//		fileRead();
//		fileWrite();
//		fileRead();
		
		
		// Read a file through BufferedReader class
		
		InputStreamReader input = new InputStreamReader(System.in);
		System.out.println("Enter a number");
		BufferedReader reader = new BufferedReader(input);
		 
		int n = Integer.parseInt(reader.readLine());
		System.out.println(n);
		
		
		
				
		
		
		
			
			
}
		
		
		
	static void fileRead() throws FileNotFoundException{
		
		FileReader read = new FileReader("C:\\Users\\User\\Downloads\\Gouda.txt");
		 //
		Scanner scr = new Scanner(read);
		scr.nextDouble();
		String str;
		
		while(scr.hasNextLine()) {
			str = scr.next();
			System.out.println(str);
		}
		
		
	}
		
	
	
static void fileWrite() throws IOException{
		
		//FileReader read = new FileReader("C:\\Users\\User\\Downloads\\Gouda.txt");
	
	FileWriter write = new FileWriter("C:\\Users\\User\\Downloads\\Gouda.txt");
	write.write("I am Gouda");
		System.out.println("I have finished My task");
		
	}
	

		
	
	
	
	 static String randomString(int charString) {
		
		Random ran = new Random ();
		String lettersLab = "bdhbbkbygfijkdhbhgnkernfbhdkbkjhsjgkjjnjbsjhrf";
		
		
		int stringCh=1;
		StringBuilder  build = new StringBuilder();
		while(!(stringCh>charString)) {	
		int digit = ran.nextInt(26);
//		System.out.println(digit);
		char ch	= lettersLab.charAt(digit);
		build.append(ch);
		stringCh++;
		
		}
		
		return build.toString();
	}

}
