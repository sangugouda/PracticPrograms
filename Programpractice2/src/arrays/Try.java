package arrays;

import java.io.FileNotFoundException;

public class Try {

	public static void main(String[] args) {
		
		
		
		try  {
		System.out.println("inside try block");
		throw  new FileNotFoundException("File not find which looking for") ;	
		// System.out.println("inside catch black");
			
		}
		
		catch(FileNotFoundException exe) {
			
		 int i =10/0;	
			System.out.println("inside catch bl0ck");
		}
		
		catch(Exception exe) {
			System.out.println("inside 3 bl0ck");
			
		}
		
		finally {
			System.out.println("inside finally bl0ck");
		}
	}

}
