package pratice1;

public class ExtractUpperCase {
	public static void main(String [] args) {
		String word = "AutoMAtion";
		for(int i=0; i<word.length();i++) {
			//if(word.charAt(i))
			char ch = word.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println(ch);
			}
		
		}
	}

}
