package Sorting.com.algorithms.examples.sortings;

public class BubbleSort {
	
	/**
	 * Algorithm for bubble sort
	 * 
	 * compare two elements and swap them do this for every element 
	 */

	public int[] bubbleSort(int[] input){
		
		int temp =0;
		// in = {3,2,6,1,7,5,8};
		
		for(int i=0; i<input.length-1; i++){
			for(int j=0; j<input.length-1; j++){
				if(input[j]>input[j+1]){
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}

		System.out.println("***************");
		
		for(int i=0; i<input.length; i++){
			System.out.print("," + input[i]);
		}
		
		System.out.println("");
		System.out.println("***************");
		
		return input;
	}
}
