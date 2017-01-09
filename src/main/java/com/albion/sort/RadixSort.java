package com.albion.sort;

import java.util.ArrayList;

public class RadixSort extends BaseSort {

	int maxDigits = 0;
	ArrayList<ArrayList<Integer>> bucket;
	
	public RadixSort(int[] aInput) {
		super(aInput);
		int maxNumber = findMax();
		maxDigits = Integer.toString(maxNumber).length();
		bucket = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			ArrayList<Integer> x = new ArrayList<>();
			bucket.add(x);
		}
	}

	public void clearBucket(){
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> list = bucket.get(i);
			list.clear();
		}
	}
	
	public int countDigits(int x){
		double temp = Math.log10(x+1);
		int digits = (int) Math.ceil(temp);
		return digits;
	}
	
	//1234, 2 => 1*1000 + 2*100 + 3*10 + 4*1
	//offset 1 means first digit from the left.
	public int extractDigits(int input , int offset){

		int digits = countDigits(input);
		int val;
		if(digits < offset) {
			return 0;
//			String x = String.valueOf(input);
//			val = Integer.valueOf(x.charAt(x.length() - 1) + "");
		} else {
			char c = String.valueOf(input).charAt(digits - offset);
			val = Integer.valueOf(String.valueOf(c)).intValue();
		}

		return val;
	}

	public int[] sort() {
		input = sortDigit(input);
		return input;
	}

	private int[] sortDigit(int[] anInput) {
		int[] result = anInput;
		for (int i = 0; i < maxDigits; i++) {
			ArrayList<Integer> resultList = new ArrayList<>();
			for(int j = 0; j < result.length; j++) {
				int index = extractDigits(result[j], i+1);
				ArrayList<Integer> list = bucket.get(index);
				list.add(result[j]);
			}
			for(int k = 0; k < bucket.size(); k++) {
				ArrayList<Integer> list = bucket.get(k);
				resultList.addAll(list);
			}

			result = resultList.stream().mapToInt(Integer::intValue).toArray();
			clearBucket();
		}
		return result;
	}
}
