package Sorting.com.algorithms.examples.sortings;

public class InsertionSort {

	/**
	 * Algorithm for insertion sort logic
	 *  
	 */

	public int[] insertionSort(int[] input){

		int temp=0, i=0, j=0;
		// in = {3,2,6,1,7,5,8};

		for(i=1; i<input.length; i++){
			j = i;
			
			while(j>=1 && input[j]<input[j-1]){
				// swap until sorted array found
				temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
				j--;
			}
		}

		System.out.println("***************");
		for(int k=0; k<input.length; k++){
			System.out.print(input[k] + " " );
		}
		
		System.out.println("");
		System.out.println("***************");

		return input;
	}
}
