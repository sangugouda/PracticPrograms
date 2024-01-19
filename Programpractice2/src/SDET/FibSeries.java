package SDET;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 2 3 5 8 13
		int a = 1; 
		int b = 2;
		 int fab = 0;
		while (fab < 1000) {
		fab = a+b;  // 3, 5 , 8
		a = b; // a = 2, 3 , 5
		b= fab; // b = 3 , 5 , 8
		if(!(fab > 1000)) {
			System.out.println(fab);
		}
		}
		

	}

}
