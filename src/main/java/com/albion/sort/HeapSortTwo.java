package com.albion.sort;

import java.util.PriorityQueue;

public class HeapSortTwo extends BaseSort implements Sorter {
	PriorityQueue<Integer> queue = null;
	public HeapSortTwo(int[] aInput) {
		super(aInput);
		queue = new PriorityQueue<Integer>();
		for(int i: aInput){
			Integer x = new Integer(i);
			queue.add(x);
		}
	}

	public void sort() {
		int len = queue.size();
		for(int i = 0; i < len; i++){
			this.input[i] = queue.remove().intValue();
		}
	}
}
