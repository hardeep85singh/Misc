package dataStructureAlgorithms;

import java.util.NoSuchElementException;

public class BinarySearchPractice {
//    int [] nums;

    public int[] selectionSort(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("Array is null");
        }

        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int smallest = nums[index];
            nums[index] = nums[i];
            nums[i] = smallest;
        }

        return nums;
    }

    public int binarySearch(int[] nums, int left, int right, int number) {
        if (nums.length == 0) {
            throw new ArrayIndexOutOfBoundsException("No element is there to search");
        }

        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == number) {
                return mid;
            }

            if (number < nums[mid]) {
                return binarySearch(nums, left, mid - 1, number);
            } else {
                return binarySearch(nums, mid + 1, right, number);
            }
        }
        return -1;
    }

    public int[] selectionSort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                index = j;
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public int binarysearch1(int[] array, int left, int right, int number) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                return mid;
            }

            if (number < array[mid]) {
                return binarySearch(array, left, mid - 1, number);
            } else {
                return binarysearch1(array, mid + 1, right, number);
            }
        }
        return -1;
    }

}
