package stringRelatedPro;

public class CountDuplicateCharInString {

	public static void main(String [] args) {
		String name = "Ankitss";
		char [] nameArray = name.toCharArray();
	     
		for(int i=0;i<nameArray.length;i++) {
			boolean flag = false;
			int count = 0;
			for(int j = i+1;j<nameArray.length;j++) {
				
				if(nameArray[i]==nameArray[j] && nameArray[i] != '$') {
					
					nameArray[j] = '$';
					count++;
					flag=true;
				}
			}
			if(flag==true) {
				System.out.println(nameArray[i] + " " + (count+1));
			}
			
			
		}
		
		
	}
}
