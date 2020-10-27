package earlyJavaObjects.chapter5;

import java.util.Scanner;

public class ReadFloatingNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter float number: ");
        float number = input.nextFloat();

        if (number == 0){
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is either negative or positive");
        }
    }

}
