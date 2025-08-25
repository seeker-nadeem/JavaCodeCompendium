package important_questions;

public class MinimumValueInAnArray {

	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 2, 8, -1, 4}; 
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum value: " + min);

	}

}
