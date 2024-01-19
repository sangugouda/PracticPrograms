package fileRelatedAndInterview;

import java.util.Arrays;
import java.util.List;

public class inter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Gouda@123";
		char [] ch = str.toCharArray();
		StringBuilder build = new StringBuilder();
		 /* for(char comparingCh : ch) {
			  if(Character.isAlphabetic(comparingCh)) {
				   build.append(comparingCh);
			   }
			  
		   } */
		   for(int i =0; i<str.length();i++) {
			   char comparingCh = str.charAt(i);
			   
			   if(Character.isDigit(comparingCh)) {
				   str.indexOf(comparingCh);
				   System.out.println(str.indexOf(comparingCh));
				  
			   }
		   }
		
		   System.out.println();
	}

}
