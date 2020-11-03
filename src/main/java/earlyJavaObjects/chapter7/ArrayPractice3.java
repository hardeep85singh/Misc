package earlyJavaObjects.chapter7;


import java.util.Random;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int length = 5;
        int[] arr = new int[length];
        randomArr(arr, length);
//        printArr(arr);
//        System.out.println(sumWithoutSmallest(arr));
//        System.out.println(alternatingSum(arr));
        reverseArr(arr);


    }

    public static int[] randomArr(int[] arr, int length) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);

    }

    public static int sumWithoutSmallest(int[] arr) {
        int sum = 0;
        int smallestValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestValue) {
                smallestValue = arr[i];
            }
            sum = sum + arr[i];
        }
        return sum - smallestValue;
    }

    public static int alternatingSum(int[]arr){
        int sum = 0;

        for (int i = 0; i< arr.length; i++){
            if (i % 2 == 0){
                sum = sum + arr[i];
            } else {
                sum = sum - arr[i];
            }
        }
        return sum;
    }

    public static int[] reverseArr(int[]arr){

        for (int i = 0; i< arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1 -i];
            arr[arr.length-1 -i] = temp;
        }
        return arr;
    }

   }
