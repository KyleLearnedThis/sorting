package com.albion.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort extends BaseSort implements Sorter {

	public SelectionSort(int[] aInput) {
		super(aInput);
	}

	public int[] sort() {
		List<Integer>  queue = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < input.length; i++){
			queue.add(input[i]);
		}
		
		while(queue.size() != 0){
			int idx = minIndex(queue);
			queue.remove(idx);
			result.add(input[idx]);
		}
		
		for(int i = 0; i < input.length; i++){
			input[i] = result.get(i).intValue();
		}

		return input;
	}
	
	public int minIndex(List<Integer> list){
		int minValue = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 0; i < list.size(); i++){
			if(minValue > list.get(i)){
				index = i;
				minValue = list.get(i);
			}
		}
		return index;
	}
	

}
