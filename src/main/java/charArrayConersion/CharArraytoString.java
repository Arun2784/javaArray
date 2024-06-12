package charArrayConersion;

import java.util.Arrays;

public class CharArraytoString {

	public static void main(String[] args) {
		
		char charArr[] =  { 'g', 'e', 'e', 'k', 's' };
		String s = Arrays.toString(charArr).replaceAll("[,\\s\\[\\]]", "");
		
		System.out.println(s);
		
		//2nd way
		char charArr1[] =  { 'g', 'e', 'e', 'k', 's' };
		String str =String.valueOf(charArr1);
		System.out.println(str);
		
		//3rd way
		char charArr2[]=  { 'g', 'e', 'e', 'k', 's' };
		
		String str2 = new String(charArr2);
		System.out.println(str2);
		
		
		
		
		

	}

}
