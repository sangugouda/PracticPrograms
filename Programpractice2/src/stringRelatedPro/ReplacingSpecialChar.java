package stringRelatedPro;

import java.util.HashSet;
import java.util.Set;

public class ReplacingSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "bdsjbjb!@#$%^bsjhcvshgvS@#%vbv05434"; 
		
		// to replacing special char
		String palinString = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(palinString);
		// to find no. of small char in the string
		System.out.println(str.length()-(str.replaceAll("[a-z]", "")).length());
		System.out.println(str.replaceAll("[^A-Z]", ""));
		
		
		// to remove space in the string
		String sysout = "bdsjbj b!@#$ %^bsjh cv shgvS @#% vbv 05434";
		System.out.println(sysout.replaceAll("\\s", ""));
		
		
		// revome duplicate char -1 
		String str3 = "Goudagao";
		String lowerCase = str3.toLowerCase();
		StringBuilder build = new StringBuilder();
		lowerCase.chars().distinct().forEach(c -> build.append((char)c));
		System.out.println(build);
		
		
		// revome duplicate char -2
		String str4 = "Goudagao";
		String lowerCase2 = str3.toLowerCase();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<lowerCase2.length();i++) {
			char ch = lowerCase2.charAt(i);	
		int index = lowerCase2.indexOf(ch, i+1);
		
		if(index == -1) {
			builder.append(ch);
		}
			
		}
		System.out.println(builder);
		
		
		
		/// revome duplicate char from string 
		
		String str5 = "Goudagao";
		String lowerCaseaJira = str3.toLowerCase();
		
		Set<Character> set = new HashSet();
		
		for(int i= 0; i<lowerCase.length();i++) {
			
			set.add(lowerCaseaJira.charAt(i));
			
		}
		
		StringBuilder buil = new StringBuilder();
		for(char ch : set) {
			buil.append(ch);
		}
		
		
		System.out.println(buil);
	}

}
