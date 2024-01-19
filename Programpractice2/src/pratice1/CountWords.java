package pratice1;

public class CountWords {
	public static void main(String [] args) {
		String sentance = "Gouda is really good ";
		int count =0;
		
		String [] arr = sentance.split(" ");
		for(int i=0;i<arr.length;i++) {
			count++;
			int lekkahaku =0;
			String word= arr[i];
			for(int j=0;j<word.length();j++) {
				lekkahaku ++;
			}
			System.out.println("char count in " + word +" is "+ lekkahaku);
			
			
		}
		System.out.println("Word count is "+ count);
	}

}
