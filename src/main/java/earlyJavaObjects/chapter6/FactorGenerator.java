package earlyJavaObjects.chapter6;

import java.util.Scanner;

public class FactorGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        factor(number);
    }

    public static void factor(int number) {

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
}
