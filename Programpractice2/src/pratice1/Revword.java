package pratice1;

public class Revword {
	public static void main(String [] args) {
		String word = "mom";
		 String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			 rev  = rev + word.charAt(i);
		}
		
		if(word.equals(rev)) {
			System.out.println( " the word "+word +" is palendrom");
		}
		else {
			System.out.println(" the word "+word+" is not a palendrom");
		}
	}

}
