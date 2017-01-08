package com.albion.sort;

import java.util.PriorityQueue;

public class HeapSortV2 extends BaseSort implements Sorter {
	PriorityQueue<Integer> queue = null;
	public HeapSortV2(int[] aInput) {
		super(aInput);
		queue = new PriorityQueue<>();
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
