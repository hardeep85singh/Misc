package dataStructureAlgorithmsTest;

import dataStructureAlgorithms.BinarySearch;
import dataStructureAlgorithms.BinarySearchPractice;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchPracticeTest {

//    @Test
//    public void test1(){
//        int[] nums = {};
//        BinarySearchPractice binarysearch = new BinarySearchPractice();
//        binarysearch.selectionSort(nums);
//        assertEquals("No element present to search", -1, binarysearch.binarySearch(nums,0,0, 2));
//    }
//
//    @Test
//    public void test2(){
//        int[] nums = null;
//        BinarySearchPractice binary = new BinarySearchPractice();
//
//        binary.selectionSort(nums);
//        assertEquals("Null", -1, binary.binarySearch(nums,0,0, 2));
//    }

    @Test
    public void test3(){
        int[] nums = {4,3,-1,5,6};
        BinarySearchPractice binary = new BinarySearchPractice();

        binary.selectionSort(nums);
        assertEquals("Binary search", 1, binary.binarySearch(nums,0,4,3));

    }


}
