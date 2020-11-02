package earlyJavaObjects.chapter6;

import java.util.Scanner;

public class ReadStudentData {
    public static void main(String[] args) {

        extra();
//        Scanner input = new Scanner(System.in);
//        String firstName = input.nextLine();
//        String lastName = input.nextLine();
//        System.out.print(firstName + " " + lastName);
//        int sum = 0;
//        int count = 0;
//
//        while (input.nextInt() != -1) {
//
//            int testScore = input.nextInt();
//            sum = sum + testScore;
//            count++;
//
//        }
//        double average = sum / count;
//        System.out.println(average);
    }

    public static void forToWhile(int i) {
        /**
         * int s =0;
         * for (int i = 1; i<=10 ; i++)
         * { s = s + 1; }
         */

        int s = 0;
        while (i > 0 && i <= 10) {
            s = s + 1;
        }
    }

    public static void doLoopChange() {
        /*

        do{
        s = 1.0/ (1+ n * n);
        n++;
        x = x +s;
        } while (s > 0.01);
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s = 0;
        boolean condition = false;
        while (s > 0.01) {

            if (!condition) {
                return;
            } else {
                s = 1.0 / (1 + n * n);
                n++;
                x = x + s;
            }
        }
    }

    public static void extra() {
        int s = 1;
        for (int n = 1; s <= 10; System.out.print(s + " ")) {
            n = n + 2;
            s = s + n;
        }
    }
}
