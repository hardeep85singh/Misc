package earlyJavaObjects.chapter7;

public class ArrayMethods {
    private int[] values;

    public ArrayMethods(int[] values) {
        this.values = values;
    }

    public int[] swapFirstAndLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public int[] shiftRight(int[] arr) {
        int temp = arr[arr.length - 1];

        for (int i = 0; i < arr.length-1; i++) {
            arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
        }
        arr[0] = temp;
        return arr;
    }

    public int[] replaceLargestNeighbor(int[]arr){

        for (int i = 1; i < arr.length-1 ; i++){
            if (arr[i-1] > arr[i +1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }else {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
    public int[] removeMiddle(int[] arr){
        for (int i =0; i< arr.length/2 ; i++){
            if(arr.length % 2 == 0){
                arr[arr.length/2 - 1 + i] = arr[arr.length/2 + 1 + i];
            } else {
                arr[arr.length/2 -1 + i] = arr[arr.length/2 +i];
            }
        }
       return arr;
    }

    public int[] segregateEvenOdd(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(arr[left] % 2 ==0 && left < right){
            left ++;
        }
        while (arr[right] % 2 ==1 && left < right){
            right --;
        }
        if(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left ++;
            right --;
        }
        return arr;
    }

    public int[] reArrangeEvenOdd(int[]arr){
        int j = -1;
        for (int i=0; i< arr.length; i++){
            if(arr[i]% 2 ==0){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }
    public boolean isIncreasingOrder(int[]arr){
        for(int i=1; i< arr.length; i++){
            if(arr[i-1] < arr[i]){
                return true;
            }
        }
        return false;
    }

    public boolean isAdjacent(int [] arr){
        for(int i = 1; i< arr.length; i++){
            if (arr[i-1] == arr[i]){
                return true;
            }
        }
        return false;
    }

    public boolean isDuplicate(int[]arr){
        for(int i = 0; i< arr.length; i++){
            for (int j = 1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }

            }
        }
        return false;
    }
}
