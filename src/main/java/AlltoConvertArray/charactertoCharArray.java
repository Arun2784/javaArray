package AlltoConvertArray;

public class charactertoCharArray {
	
	//No such thing in java
	//instead we will convert to String to char array.
	
	public static void main(String[] args) {
	String s ="Hello";
	char[] charArray =s.toCharArray();
	
	for(char c :charArray) {
		
		System.out.print(c+" ");
		
		
	}

}}
