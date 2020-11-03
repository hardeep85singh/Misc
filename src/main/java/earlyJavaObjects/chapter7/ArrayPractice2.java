package earlyJavaObjects.chapter7;

import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        readNum(arr);
        printOpposite(arr);

    }

    public static int[] readNum(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void printOpposite(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
    }
}
