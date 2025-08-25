package important_questions;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray2 {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        //int n = arr.length;
        
        int[] resultArr = new int[arr.length];
        int j = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                resultArr[j++] = arr[i];
            }
        }
        
        // Add the last element always
        resultArr[j++] = arr[arr.length - 1];
        
//        // Print unique elements
//        System.out.print("Array without duplicates: ");
//        for (int i = 0; i < j; i++) {
//            System.out.print(resultArr[i] + " ");
//        }
        
     // Shrink to exact size (no trailing zeros)
        int[] temp = Arrays.copyOf(resultArr, j);
        
        // Print result
        System.out.println("Array without duplicates: " + Arrays.toString(temp));

	}

}
