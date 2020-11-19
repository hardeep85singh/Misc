package dataStructureAlgorithmsTest;

import dataStructureAlgorithms.InsertionSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {

    InsertionSort sort = new InsertionSort();
    @Test
    public void test1(){
        int [] arr = {};
        assertArrayEquals(null, sort.insertionSort(arr));
    }

    @Test
    public void test2(){
        int [] arr = null;
        assertArrayEquals(null, sort.insertionSort(arr));
    }

    @Test
    public void test3(){
        int[] arr = {0, 5, -4, -2, 3, 1, 9};
        int[] sortedArr = {-4,-2,0,1,3,5,9};
        assertArrayEquals(sortedArr, sort.insertionSort(arr));
    }
}
