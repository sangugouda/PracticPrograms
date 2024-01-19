package pratice1;

public class CountaVowel {

	public static void main(String[] args) {
		String word = "i love you";
		int count = 0;
		char[] arr =word.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a') {
				count++;
				
			}
		}
System.out.println(count);
	}

}
