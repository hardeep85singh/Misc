package dataStructureAlgorithms;

public class SelectionSort {

    public int[] selectionSort(int[] nums) {
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


}
