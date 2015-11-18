package Sorting.com.algorithms.examples.sortings;

public class QuickSort {
	
	int i;
	
	public QuickSort(){
		this.i=0;
	}
	
	public QuickSort(int n){
		this.i = n;
	}
	
	/**
	 * Algorithm for quick sort
	 * 
	 * find minimum and swap it with sorted sub array (at the start of list)
	 *  
	 */

	public int[] selectionSort(int[] input){
		
		int temp=0, i=0, j=0, index=0;
		// in = {3,2,6,1,7,5,8};
		
		for(i=0; i<input.length; i++){
			index = i;
			
			for(j=i; j<input.length; j++){
				if(input[index]>input[j]){
					index = j;
				}
			}
			
			// swap with sorted sub list
			temp = input[index];
			input[index] = input[i];
			input[i] = temp;
		}

		System.out.println("***************");
		for(int k=0; k<input.length; k++){
			System.out.print("," + input[k]);
		}
		System.out.println("");
		System.out.println("***************");
		
		return input;
	}
}
