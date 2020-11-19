package dataStructureAlgorithms;

public class ThreeWayQuickSort {

    public int[] threeWayQuickSort(int[] nums, int begin, int end) {
        if (end <= begin) {
            return nums;
        }
        // partition

        int i = begin;
        int less = begin;
        int greater = end;

        while (i <= greater) {
            if (nums[i] < nums[less]) {
                int temp = nums[i];
                nums[i] = nums[less];
                nums[less] = temp;
                i++;
                less++;
            } else if (nums[less] < nums[i]) {
                int temp = nums[i];
                nums[i] = nums[greater];
                nums[greater] = temp;
                greater--;
            } else {
                i++;
            }
        }
        threeWayQuickSort(nums, begin, less - 1);
        threeWayQuickSort(nums, greater + 1, end);
        return nums;
    }
}
