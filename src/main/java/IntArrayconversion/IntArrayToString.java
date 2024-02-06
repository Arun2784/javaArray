package IntArrayconversion;

import java.util.Arrays;

public class IntArrayToString {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
         
        String intresult =Arrays.toString(intArray).replaceAll("[,\\s\\[\\]]", "");
        
        System.out.println(intresult);
    }
}

