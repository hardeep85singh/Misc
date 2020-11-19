package dataStructureAlgorithmsTest;


import dataStructureAlgorithms.QuickSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    QuickSort sort = new QuickSort();

    @Test
    public void test1() {
        int[] arr = {};
        int[] sortarr ={};
        assertArrayEquals(null, sort.quickSort(arr, 0, 0));
    }

    @Test
    public void test2() {
        int[] arr = {6, 3, 5, -3, -6, 0, 2};
        int[] sortedArray = {-6, -3, 0, 2, 3, 5, 6};
        assertArrayEquals(sortedArray, sort.quickSort(arr, 0, arr.length-1));
    }
}
