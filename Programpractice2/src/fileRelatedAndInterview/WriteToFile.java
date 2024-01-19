package fileRelatedAndInterview;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\User\\Downloads\\Dam\\Sample.txt";
		try {
			FileWriter write = new FileWriter(path);
			
			write.write("I am Gouda Writting this message through programing");
			write.close();
			System.out.println("Job Done! Gouda. I have written things in file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
