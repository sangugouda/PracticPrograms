package stringRelatedPro;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Good Lofe";
		char [] ch = word.toCharArray();
		for(int i=0;i<word.length();i++) {
			
			int count = 0;
			for(int j=i+1;j<word.length();j++) {
				
				if(ch[i]==ch[j] && ch[i] != ' ') {
					
					count ++;
					ch[j] = '$';
					
				}
				
			}
			if(count>0 && ch[i]!='$') {
				System.out.println(ch[i]);
			}
			
		}

	}

}
