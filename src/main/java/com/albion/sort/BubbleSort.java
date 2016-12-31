package com.albion.sort;

public class BubbleSort extends BaseSort implements Sorter {

	public BubbleSort(int[] aInput) {
		super(aInput);
	}

	public void sort() {
		int len = getInput().length;
		int i, j,t=0;
		for(i = 0; i < len; i++){
			for(j = 1; j < (len-i); j++){
				if(getInput()[j-1] > getInput()[j]){
					t = getInput()[j-1];
					getInput()[j-1]=getInput()[j];
					getInput()[j]=t;
				}
			}
		}
	}
}
