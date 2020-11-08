package dataStructureAlgorithms;

import java.util.Arrays;

public class BinarySearchMain {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 9, 2, 3, 1};
        BinarySearch search = new BinarySearch();
        search.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(search.binarySearch(array, 0, array.length, 4));
        search.rotateArray(array, 3);
        System.out.println(Arrays.toString(array));
    }
}
