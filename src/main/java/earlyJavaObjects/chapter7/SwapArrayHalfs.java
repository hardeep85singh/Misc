package earlyJavaObjects.chapter7;

import java.util.Arrays;

public class SwapArrayHalfs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(swapHalfs(arr)));
    }

    public static int[] swapHalfs(int[] arr) {
        int temp = 0;
        int j = arr.length / 2;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < j; i++) {
                temp = arr[i];
                arr[i] = arr[j + i];
                arr[j + i] = temp;
            }
        } else {
            for (int i = 0; i < j; i++) {
                temp = arr[i];
                arr[i] = arr[j + 1 + i];
                arr[j + 1 + i] = temp;
            }
        }
        return arr;
    }


}
