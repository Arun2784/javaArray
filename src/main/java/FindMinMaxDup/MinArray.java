package FindMinMaxDup;

public class MinArray {

	public static void main(String[] args) {
		
		
		int [] value = {43,44,20,110,56,77};
		
		int length = value.length;
		
		 int min = value[0];
		 
		 
		for(int i =0; i<length; i++) {
			
			if(value[i] < min) {
				
				min =value[i];
				
				
			}		
			
		}
		
		System.out.println(min);
		
			}

}
