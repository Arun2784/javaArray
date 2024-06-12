package charArrayConersion;

public class charArraytoint {
	
	public static void main(String[] args) {
	
	
	char[] arr = { '1', '2', '7', '9' };
    
    String str = new String(arr);
    
    try {
    int num = Integer.parseInt(str);
   
    System.out.println(num);
	
    } catch(NumberFormatException e) {
        System.out.println("Error: " + e.getMessage());

    
    }
}}
