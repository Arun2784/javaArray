package charArrayConersion;

import java.util.Arrays;

public class CharArraytoString {

	public static void main(String[] args) {
		
		char charArr[] =  { 'g', 'e', 'e', 'k', 's' };
		String s = Arrays.toString(charArr).replaceAll("[,\\s\\[\\]]", "");
		
		System.out.println(s);

	}

}
