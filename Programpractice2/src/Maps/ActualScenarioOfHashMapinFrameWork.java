package Maps;

import java.util.HashMap;
import java.util.Map;

public class ActualScenarioOfHashMapinFrameWork {
	
	static String getCreadentials(String privilage) {
		Map<String, String> map = new HashMap<>();
	
		map.put("Candidate", "Gouda:Gouda@123");
		map.put("Doctor", "Harish:Harish@123");
		map.put("Pharma", "Shakuntala:Shakuntala@123");
		
		String userNamePassword = map.get(privilage);
		   
		String [] arr = userNamePassword.split(":");
		return arr[1]; 
		
	}

	public static void main(String [] args) {
		
	System.out.println(getCreadentials("Pharma"));
	}
}
