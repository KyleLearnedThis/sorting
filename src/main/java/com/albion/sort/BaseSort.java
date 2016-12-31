package com.albion.sort;

public abstract class BaseSort implements Sorter {
	protected int[] input;

	public BaseSort(int[] aInput){
		setInput(aInput);
	}

	public void print(){
		System.out.print("[ ");
		for(int i: getInput()){
			System.out.print(" "+i);
		}
		System.out.println(" ]");
	}

	public int[] getInput() {
		return input;
	}

	public void setInput(int[] input) {
		this.input = input;
	}

	public void swap(int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void swapV2(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public int findMax(){
		int cur_max = Integer.MIN_VALUE;
		for(int i = 0; i < input.length; i++){
			if(cur_max < input[i]){
				cur_max = input[i];
			}
		}
		return cur_max;
	}
	
	public int findMin(){
		int cur_min = Integer.MAX_VALUE;
		for(int i = 0; i < input.length; i++){
			if(cur_min > input[i]){
				cur_min = input[i];
			}
		}
		return cur_min;
	}
}
