package com.albion.sort;

public class BubbleSort extends BaseSort implements Sorter {

	public BubbleSort(int[] aInput) {
		super(aInput);
	}

	public int[] sort() {
		int[] input = getInput();
		int len = input.length;
		int i, j,t;
		for(i = 0; i < len; i++){
			for(j = 1; j < (len-i); j++){
				if(input[j-1] > input[j]){
					t = input[j-1];
					input[j-1] = input[j];
					input[j] = t;
				}
			}
		}
		return input;
	}
}
