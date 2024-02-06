package FindMinMaxDup;

public class secondMinArray {

	public static void main(String[] args) {
		
		int [] value  = {23,10,36,56, 21, -19};
		
		int length = value.length;
		int min = 0;
		 int second_min = 0;
		 
		 for (int i =0; i < length; i++) {  // 23 < 0
			  if (value [i] < min) {
				  second_min = min;      
			       min =value[i];
			   
			  }	 else if (value [i] < second_min) {
				  
				  second_min =value[i];
				  
			  }
			  		  
			  
		 }
			 System.out.println(second_min);
			 
			 
		 }
		
		
	}


