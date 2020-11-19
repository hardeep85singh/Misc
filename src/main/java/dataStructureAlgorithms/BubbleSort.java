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

    public int[] bubblesort1(int [] array){

        for (int i = 0; i< array.length-1; i++){
            for (int j= 1; j< array.length; j++){
                if(array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;
    }
}
