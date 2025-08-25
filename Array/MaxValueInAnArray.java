package important_questions;

public class MaxValueInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {2,7,11,5,28};
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum value: " + max);
	}

}
