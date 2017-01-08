package com.albion.sort;

public class QuickSort extends BaseSort {

	public QuickSort(int[] aInput) {
		super(aInput);
	}

	public void sort() {
		if(input == null || input.length == 0)
			return;
		quickSort(0, input.length -1);
	}

	public void quickSort(int low, int high){
		int i = low;
		int j = high;
		int pivot_index = low + (high - low)/2;
		int pivot_value = input[pivot_index];

		while(i <= j){
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (input[i] < pivot_value) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (input[j] > pivot_value) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(low, j);
		if (i < high)
			quickSort(i, high);
	}

}
