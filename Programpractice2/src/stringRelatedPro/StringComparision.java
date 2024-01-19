package stringRelatedPro;

public class StringComparision {

	public static void main (String [] agrs) {
		String str = "aabcccccaaa";
		char [] arr = str.toCharArray();
		
		for(int i=0;i<arr.length-1;i++) {
			int count = 1;
		if(arr[i] == arr[i+1]) {
			count++;
			System.out.print(arr[i]+count);
			
		}
		
		else if(!(arr[i]==arr[i-1])){
			System.out.print(arr[i]+count);
		}
		
			
//			for(int k=i-1; k>=0;k--) {
//				
//				if(!(arr[k] == arr[i])) {
//					
//				}
//				
//			}
			
		}
		
	}
}
