package dataStructureAlgorithmsTest;

import dataStructureAlgorithms.ThreeWayQuickSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class ThreeWayQuickSortTest {

    ThreeWayQuickSort sort = new ThreeWayQuickSort();

    @Test
    public void test1(){
        int[] arr = null;
        assertArrayEquals(null, sort.threeWayQuickSort(arr, 0, 0));
    }

    @Test
    public void test2(){
        int[] arr = {-6,9,3,0,-2,7,1};
        int[] sortedArr = {-6,-2,0,1,3,7,9};
        assertArrayEquals(sortedArr, sort.threeWayQuickSort(arr,0, arr.length-1));
    }

}
