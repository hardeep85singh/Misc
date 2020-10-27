package earlyJavaObjects.chapter4;

import java.util.Scanner;

public class TimeDifference {
    public static void  main(String[]args){
        Scanner inputTime = new Scanner(System.in);
        System.out.println("Please enter the first time: ");
        int firstTime = inputTime.nextInt();
        System.out.println(("Please enter the second time: "));
        int secondTime = inputTime.nextInt();
        int diffTime;

        if (secondTime >= firstTime){
            diffTime = secondTime - firstTime;
                } else {
            diffTime = (2360 - firstTime) + secondTime;
        }
        int hrs = diffTime / 100;
        int minutes = diffTime % 100;

        System.out.printf("%d%s%d%s%n", hrs, " hours "
                , minutes, " minutes");

    }
}
