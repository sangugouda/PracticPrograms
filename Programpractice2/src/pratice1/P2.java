package pratice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P2 extends P1{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Bye");
		P1 ge = new P1();
		ge.greeting();
		FileInputStream fis = new FileInputStream("c//add");
		prop.load(fis);
	}

}
