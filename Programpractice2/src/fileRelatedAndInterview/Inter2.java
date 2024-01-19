package fileRelatedAndInterview;

public class Inter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	I/p:[5,0,1,0,2,0,3,0] 
				
				
		//		o/p:[0,0,0,0,5,1,2,3]

			 StringBuilder builder = new StringBuilder();
			int [] arr = {5,0,1,0,2,0,3,0};
		
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==0){
				builder.append(arr[i] + ",");
			}
			
			
		}
			for(int i=0; i<arr.length; i++) {
			
			if(arr[i]!=0){
				builder.append(arr[i] + ",");
			}
			
			
		}
			
			System.out.println(builder);
		
	}
	

}
