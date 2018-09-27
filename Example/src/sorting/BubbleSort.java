package sorting;

public class BubbleSort {

	/*
	 * Simple method for Sorting int array
	 */
	public static int[] sort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	/*
	 * Generic method for Sorting wrapper classes
	 */
	public static <E extends Comparable<E>> E[] genericSort(E[] array){
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					E temp =  array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	/*
	 * Generic method for Printing wrapper classes
	 */
	public static <E> void genericPrint(E[] array) {
		for(E element:array) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		Integer[] integerArray = {1,9,6,5,4};
		Double[] doubleArray = {1.7,7.5,5.9,9.6,5.1};
        String[] stringArray = {"a","z","d","c"};
		
		genericPrint(genericSort(integerArray));
		genericPrint(genericSort(doubleArray));
		genericPrint(genericSort(stringArray));
		
		
		
		
	}

}
