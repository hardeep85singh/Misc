package dataStructureAlgorithms;

import java.util.Arrays;

public class MergeSortTester {
    public static void main(String[]args){
//        MergeSort mergeSort = new MergeSort();
        int[] array = {5,4,5,6,9,2,1};
//        mergeSort.sort(array,0,array.length-1);

        BinarySearch search = new BinarySearch();
        search.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print(search.binarySearch(array,0, array.length, 4));

    }
}
