package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomSync {
	
	private final Map<String, Integer> map = new HashMap<>();
	private final Lock lock = new ReentrantLock();

	 void SyncMachanium() {
		 lock.lock();
		 try {
			 map.put("Ten Thousand", 10000);
		 }
		 finally {
			 lock.unlock();
		 }
		 System.out.println(map);
	 }
	public static void main(String[] args) {
		CustomSync sync = new CustomSync();
		sync.SyncMachanium();
		
	}

}
