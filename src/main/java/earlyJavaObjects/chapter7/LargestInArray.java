package earlyJavaObjects.chapter7;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String [] args){
        final int LENGTH = 100;
        double [] values = new double[LENGTH];
        int currentSize = 0;

        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length){
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        System.out.println("Largest number in array is: " + largestValue(values, currentSize));


    }

    public static double largestValue(double[] values, int currentSize){
        double largest = values[0];
        for(int i =1; i< currentSize; i++){
            if(values[i] > largest){
                largest = values[i];
            }
        }
        return largest;
    }
}
