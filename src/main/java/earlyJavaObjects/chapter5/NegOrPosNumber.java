package earlyJavaObjects.chapter5;

import java.util.Scanner;

public class NegOrPosNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        if(number < 0){
            System.out.println("Number is negative");
        } else if( number == 0){
            System.out.println("Number is zero");
        } else{
            System.out.println("Number is positive");
        }
    }
}
