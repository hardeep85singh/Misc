package earlyJavaObjects.chapter6;

import java.util.ArrayList;
import java.util.List;

public class LoopSamplePrograms {
    public static void main(String[] args) {
//        System.out.println(sumEvenNums(2, 10));
//        System.out.println(sumSquare(2, 100));
//        System.out.println(sumOddDigits(32677));

        int [] arr = {2,4,6,6,54,1,1,9};
//        System.out.println(largestNum(arr));
//        System.out.println(smallestNum(arr));
        System.out.println(adjDuplicates(arr));
    }

    public static int sumEvenNums(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumOddNums(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumSquare(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= Math.sqrt(num2); i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    public static int sumOddDigits(int num) {

        int sum = 0;
        int quotient;
        int remainder;
        while (num != 0) {
            quotient = num / 10;
            remainder = num % 10;
            if (remainder % 2 == 1) {
                sum = sum + remainder;
            }
            num = quotient;
        }
        return sum;
    }

    public static int largestNum(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestNum(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static List adjDuplicates(int [] arr){
        List result = new ArrayList();
        int count = 1;
        while (count < arr.length){

            if (arr[count-1] == arr[count]){
                result.add(arr[count]);
            }
            count++;
        }
        return result;
    }

}

