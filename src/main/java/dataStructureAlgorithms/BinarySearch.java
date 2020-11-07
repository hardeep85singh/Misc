
package dataStructureAlgorithms;

public class BinarySearch {
    public int[] array;
    int size;

    public int[] sort(int[] array) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);
        return array;
    }

    public int binarySearch(int[] array, int left, int right, int number) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                return mid;
            }
            if (array[mid] > number) {
                return binarySearch(array, left, mid - 1, number);
            } else {
                return binarySearch(array, mid + 1, right, number);
            }
        }
        return -1;
    }

}
