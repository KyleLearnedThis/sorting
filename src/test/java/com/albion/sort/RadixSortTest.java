package com.albion.sort;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RadixSortTest {
    @Test
    public void testCountDigits() throws Exception {
        int[] input = {3,2,1,5,7,4,6,9,8,10};
        int x = 321;
        RadixSort rdx = new RadixSort(input);
        int actual = rdx.extractDigits(x,1);
        Assert.assertEquals(actual, 3);

        actual = rdx.extractDigits(x, 4);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testSort() throws Exception {
        int[] input = {1234, 56, 789, 10, 1};
        RadixSort rdx = new RadixSort(input);
        int[] result = rdx.sort();
    }
}