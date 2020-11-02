package earlyJavaObjects.chapter6;

import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        primeNum(number);

    }

    public static void primeNum(int num) {

        for (int i = 1; i <= num; i++) {
            int counter = 0;
            for (int j = i; j >=1; j--) {
                if (i % j == 0)
                    counter = counter+1;
            }
            if (counter ==2){
                System.out.print(i + " ");
            }
        }
//        System.out.print(num + " ");
    }
}
