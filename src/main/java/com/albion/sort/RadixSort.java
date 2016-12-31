package com.albion.sort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort extends BaseSort {

	int maxDigits = 0;
	
	class RadixList{
		List<Integer> radix = null;
		public RadixList(){
			radix = new ArrayList<Integer>();
		}
		public void clear(){
			radix.clear();
		}
	}
	
	protected RadixList[] bucket;
	
	public RadixSort(int[] aInput) {
		super(aInput);
		bucket = new RadixList[10];
		this.maxDigits = findMax();
	}

	public void clear(){
		for(int i = 0; i < bucket.length; i++){
			bucket[i].clear();
		}
	}
	
	public int countDigits(int x){

		double temp = Math.log10(x+1);
		int digits = (int) Math.ceil(temp);
		return digits;
	}
	
	//1234, 2 => 1*1000 + 2*100 + 3*10 + 4*1
	public int extractDigits(int input , int zero_based_offset){

		int digits = countDigits(input);
		if(digits < zero_based_offset) {
			return 0;
		}
		char c = String.valueOf(input).charAt(digits - zero_based_offset);
		int val = Integer.valueOf(String.valueOf(c)).intValue();
		//		System.out.println("value: xxxxx:" + String.valueOf(val));
		return val;
	}

	public void sort() {

	}

}
