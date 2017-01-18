package com.albion.sort;

import junit.framework.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSortTest {
    @Test
    public void testSort() throws Exception {
        List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        int[] expected = list.stream().mapToInt(i->i).toArray();
        Collections.shuffle(list);
        int[] input = list.stream().mapToInt(i->i).toArray();
        System.out.println("Input:");
        Arrays.stream(input).forEach(val -> System.out.print(val + " "));
        MergeSort ms = new MergeSort(input);
        int[] actual = ms.sort();
        boolean result = Arrays.equals(actual, expected);
        Assert.assertTrue(result);
        System.out.println("\nOutput:");
        Arrays.stream(input).forEach(val -> System.out.print(val + " "));
    }

}