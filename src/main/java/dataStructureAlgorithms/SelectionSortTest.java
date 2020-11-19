package dataStructureAlgorithms;

import java.util.Arrays;

public class SelectionSortTest {
    public static void main(String[]args){
//        SelectionSort sort = new SelectionSort();
        int [] nums = {5,1,12,-5,16,2,12,14};


        BinarySearchPractice binarySearch = new BinarySearchPractice();
        binarySearch.selectionSort(nums);
        System.out.println(Arrays.toString(binarySearch.selectionSort(nums)));

    }
}
