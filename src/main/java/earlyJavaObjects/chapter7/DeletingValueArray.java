package earlyJavaObjects.chapter7;

import java.util.Arrays;

public class DeletingValueArray {
    public static  void main(String[]args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

       System.out.println(Arrays.toString(delNthElementOrdered(arr, 4)));
//        System.out.println(Arrays.toString(delNthElementUnordered(arr, 5)));

    }

    public static int[] delNthElementUnordered(int [] arr, int pos){
        int currentSize = arr.length;

        arr[pos] = arr[currentSize -1];
        currentSize --;
        return arr;
    }

    public static int[] delNthElementOrdered(int [] arr, int pos){
        int currentSize= arr.length;

        for (int i = pos+1; i < arr.length; i++){
            arr[i -1] = arr[i];
        }
        currentSize --;
        return arr;
    }
}
