package com.albion.sort;

import java.util.ArrayList;
import java.util.List;


public class InsertionSort extends BaseSort implements Sorter {

	public InsertionSort(int[] aInput) {
		super(aInput);
	}

	public void sort() {
		List<Integer> list = new ArrayList<Integer>();
		int len = input.length;
		//traverse each element in array
		for(int i = 0; i < len; i++){
			for(int j = 0; j < list.size(); j++){
				if(input[i] < list.get(j)){
					list.add(j, input[i]);
					break;
				}
			}
		}
		for(int r = 0; r < list.size(); r++){
			input[r] = list.get(r).intValue();
		}

			
	}

}
