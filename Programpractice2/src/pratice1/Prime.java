package pratice1;

public class Prime {
	public static void main(String [] args) {
		int number = 11;
		boolean flag = false;
		for(int i=2;i<50;i++) {
			if(number/i==0) {
				flag= true;
				
				
			}
		}
		if(flag==false) {
			System.out.println(" not prime number");
		}
		else {
			System.out.println(" prime number");
		}
		
	}

}
