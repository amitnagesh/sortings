package Sorting.com.algorithms.examples.sortings;

/**
 * Sorting algorithm run
 *
 */
public class App  extends QuickSort {

	public static void main( String[] args ) {

			int[] in = {3,2,6,1,7,5,8,10,110,200,41,29};
		//	int[] in = {-1, 3, 5, (int) 2.0, 8 };
		

			BubbleSort bs = new BubbleSort();
			bs.bubbleSort(in);
		
//		//	SelectionSort ss = new SelectionSort(); 
//		//	ss.selectionSort(in);
//
//		//	InsertionSort is = new InsertionSort();
//		//	is.insertionSort(in);
//
//		//	Apprun();
	}

	public void appRun(){
		System.out.println("hello");

	}
}
