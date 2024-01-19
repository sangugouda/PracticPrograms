package stringRelatedPro;
//Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online
	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.*;
public class Rough {
	    public static void main(String[] args) {
	      
	    	/*Scanner scr = new Scanner(System.in);
	        System.out.println("Enter word1 value");
	        String word1 =  scr.next();
	        char [] arr = word1.toCharArray();
	        
	        for(int i=0; i<arr.length; i++ ){
	           for(int j=0; j<arr.length; j++ ){
	               if(arr[i]==arr[j] && i!=j && arr[i]!='$'){
	                   arr[j] = '$';
	               }
	           }
	           
	           
	           
	       }
	        char ch = (char) '$';
	        List<Object> list = Arrays.asList(arr);
	        list.remove(ch);
	        Object [] modifiedArray = list.toArray();

	            System.out.println(Arrays.toString(modifiedArray));
	           */
	    	
	    System.out.println(replaceMethod("I am Gouda", "Gouda", "Pavitra"));
	    }
	   
	    
	    
	    
	    
	    
	    
	    
	    public static void Method(String word){
	        char [] arr = word.toCharArray();
	        
	        int maxCountOfChar=1;
	        char ch = 'a';
	        for(char checkingCh : arr){
	           int index = word.indexOf(ch);
	            
	        }
}
	    
	    public static String replaceMethod(String word, String wordtobeReplaced, String replacingWord){
	        String modifiedWord =  word.replace(wordtobeReplaced,replacingWord);
	        
	         return modifiedWord;
	          
	      }
	    
	    }

