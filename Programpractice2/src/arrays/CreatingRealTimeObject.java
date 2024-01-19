package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingRealTimeObject {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("add first element");
		String ele = scr.next();
		System.out.println("add second element");
		String ele2 = scr.next();
		System.out.println("add thrird element");
		String ele3 = scr.next();
		
		System.out.println("add fourth element");
		String ele4 = scr.next();
		
		System.out.println("add fifth element");
		String ele5 = scr.next();
		 
		List<String> list = new ArrayList();
		list.add(ele);
		list.add(ele2);
		list.add(ele3);
		list.add(ele4);
		list.add(ele5);
		
		
		for(String obj: list) {
			if(obj.equalsIgnoreCase("thre")) {
				System.out.println(obj);
				
			}
			
		}
		
//		for(int i=0;i<list.size();i++) {
//			if(i==2) {
//				System.out.println(list.get(i));
//			}
//			
//		}
//		
		System.out.println(list);
		
//		System.out.println(list);
//		
//		list.set(3, "grey");
//		
//		System.out.println(list);
		
		
		
		

	}

}
