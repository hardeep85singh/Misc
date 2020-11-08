package dataStructureAlgorithms;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[]args){
        BubbleSort sort = new BubbleSort();
        int [] nums = {5,1,12,-5,16,2,12,14};

        System.out.println(Arrays.toString(sort.bubbleSort(nums)));

    }

}
