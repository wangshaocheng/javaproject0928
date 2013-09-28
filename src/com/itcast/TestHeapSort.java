package com.itcast;

/**
 * heap sort test
 * @author Administrator
 *
 */
public class TestHeapSort {

	public static void main(String[] args) {
		int[] a = { 28, 39, 3, 9, 2929, 22 };
		// adjust first half numbers, then the first number will be the largest
		for (int i = (a.length / 2); i >= 1; i--) {
			heapAdjust(i, a.length, a);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void heapAdjust(int postion, int size, int[] array) {
		//adjust the left child tree	
		if (2 * postion <= size) {
			if (array[2 * postion - 1] > array[postion - 1]) {
				int tmp = array[2 * postion - 1];
				array[2 * postion - 1] = array[postion - 1];
				array[postion - 1] = tmp;
				
				//adjust child tree which parent node index is 2*position
				heapAdjust(2 * postion, size, array);
			}
		}
		//adjust the right child tree
		if (2 * postion + 1 <= size) {
			if (array[2 * postion] > array[postion - 1]) {
				int tmp = array[2 * postion];
				array[2 * postion] = array[postion - 1];
				array[postion - 1] = tmp;
			}
			//adjust child tree which parent node index is 2*position+1
			heapAdjust(2 * postion + 1, size, array);
		}
		
		
	}
}
