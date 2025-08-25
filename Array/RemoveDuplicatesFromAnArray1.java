package important_questions;

public class RemoveDuplicatesFromAnArray1 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 5, 5, 7};
        
        int[] resultArr = new int[arr.length];
        int j = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                resultArr[j] = arr[i];
                j++;
            }
        }
        
        //j = 4
        //resultArr = {1,2,3,5,0,0,0}
        
        // Add the last element always
        resultArr[j] = arr[arr.length - 1];
        //resultArr = {1,2,3,5,7,0,0}
        
        //Print complete resultArray
//        for (int i = 0; i < resultArr.length; i++) { //0,1,2,3,4,5
//            System.out.print(resultArr[i] + " ");
//        }
        
        //unique elements
        System.out.print("Array without duplicates: ");
        for (int i = 0; i <= j; i++) { //0,1,2,3,4
            System.out.print(resultArr[i] + " ");
        }
	}

}
