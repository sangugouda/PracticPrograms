package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> list = Arrays.asList(arr);
		Collections.shuffle(list);
		
		System.out.println(Arrays.toString(list.toArray()));
		
			
			
	}
	*/
	
	public class JavaWordCount {
	    public static void main(String[] args) {
	        String sentence = "testjavajavahhhh";
	        String targetWord = "java";

	        int count = countOccurrences(sentence, targetWord);

	        System.out.println("The word '" + targetWord + "' appears " + count + " times.");
	    }

	    public static int countOccurrences(String text, String target) {
	        int count = 0;
	        int index = text.indexOf(target);

	        while (index != -1) {
	            count++;
	            index = text.indexOf(target, index + 1);
	        }

	        return count;
	    }
	}


