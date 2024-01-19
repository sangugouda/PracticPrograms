package pratice1;

import java.time.LocalTime;

class Maxnumber {
	 public static void main(String [] args) {
		 LocalTime dayOfMonth = LocalTime.now();
		 int [] numbers = {55,75,44,66,99,10,25,33};
		 int maxno=55;
		 for(int i=0;i<numbers.length;i++) {
			 if (numbers[i] < maxno) {
				 maxno = numbers[i];
				 
			 }
			 
		 }
		 
		 System.out.println(maxno);
		 System.out.println(dayOfMonth);
	 }
	

}
