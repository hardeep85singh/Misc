package dataStructureAlgorithms;

public class BubbleSort {

    public int[] bubbleSort(int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j-1]) {
                    min = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = min;
                }
            }
        }
        return nums;
    }
}
