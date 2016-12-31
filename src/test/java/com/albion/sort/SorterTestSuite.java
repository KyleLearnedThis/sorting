package com.albion.sort;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class SorterTestSuite {

	
  @BeforeClass
  public void setUp(){
	  
  }
	
  @Test
  public void testBubbleSort() {
	  int[] data = {9,8,7,6,5,4};
	  BubbleSort bs1 = new BubbleSort(data);
	  bs1.sort();
	  bs1.print();
  }
  
  @Test
  public void testInsertionSort(){
	  int[] data = {9,8,7,6,5,4};
	  InsertionSort is1 = new InsertionSort(data);
	  is1.sort();
	  is1.print();
  }
  
  @Test
  public void testSelectionSort(){
	  int[] data = {9,8,7,6,5,4};
	  SelectionSort ss1 = new SelectionSort(data);
	  ss1.sort();
	  ss1.print();
  }
  
  @Test
  public void testQuickSort(){
	  int[] data = generateData(1000);
	  QuickSort qs1 = new QuickSort(data);
	  long start = System.currentTimeMillis();
	  qs1.sort();
	  long finish = System.currentTimeMillis();
	  System.out.println("time: " + (finish - start));
	  qs1.print();
  }
  
  @Test
  public void testRadixSort(){
	  int[] data = {1000,208,37,6,5,4};
	  RadixSort rd1 = new RadixSort(data);
	  rd1.sort();
	  rd1.print();
  }
  
  @Test
  public void testHeapSort01(){
	  int[] data =  {9,8,7,6,5,4};
	  HeapSort hs = new HeapSort(data);
	  long start = System.currentTimeMillis();
	  hs.sort();
	  long finish = System.currentTimeMillis();
	  System.out.println("time: " + (finish - start));
	  hs.print();
  }

	@Test
	public void testHeapSort02(){
	  	int[] data =  generateData(1000);
		HeapSort hs = new HeapSort(data);
		long start = System.currentTimeMillis();
		hs.sort();
		long finish = System.currentTimeMillis();
		System.out.println("time: " + (finish - start));
		hs.print();
	}
  
  private int[] generateData(int size) {
	  int[] data = new int [size];
	  Random random = new Random();
	  for(int i = 0; i < size; i++){
		  int val = random.nextInt();
		  data[i] = Math.abs(val) % 10000;
	  }
	  return data;
  }
}
