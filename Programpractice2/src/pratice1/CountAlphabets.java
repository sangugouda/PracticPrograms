package pratice1;

public class CountAlphabets {
	public static void countchar() {
		String name = "Basavaraj";
		int count = 0;
		char find= 'a';
		char[] arr =name.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== find) {
				count ++;
			}
		}
		System.out.println("count of a is "+ count);
		
	}

	public static void main(String[] args) {
		String name= "Basavaraj";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='B') {
				count++;
				
			}
		}
		System.out.println(count);
		countchar();

	}

}

