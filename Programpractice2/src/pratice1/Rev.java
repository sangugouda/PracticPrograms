package pratice1;

public class Rev {

	public static void main(String[] args) {
		String name = "dad";
		String rev= "";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		if(name.equals(rev)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}

	}

}
