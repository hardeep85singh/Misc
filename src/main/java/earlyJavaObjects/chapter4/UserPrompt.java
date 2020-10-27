package earlyJavaObjects.chapter4;

import java.util.Scanner;

public class UserPrompt {
    public static void main(String[]args){
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println(sum);
//
//        System.out.println(num1 - num2);
//
//        System.out.println(num1*num2);
//        System.out.println(sum/2);
//        System.out.println(Math.abs(num1 - num2));
//        System.out.println(Math.max(num1, num2));
//        System.out.println(Math.min(num1, num2));

        Scanner inputRadius = new Scanner(System.in);
        double radius = inputRadius.nextDouble();

        double areaCircle = Math.PI * radius * radius;
        double perimeterCircle = Math.PI * 2 * radius;
        double areaSphere = Math.PI * radius * radius * 4;
        double volumeSphere = Math.PI * radius * radius * radius * 4 /3;
        System.out.printf("%.2f%n", areaCircle);
        System.out.printf("%.2f%n", perimeterCircle);
        System.out.printf("%.2f%n", areaSphere);
        System.out.printf("%.2f%n", volumeSphere);


    }
}
