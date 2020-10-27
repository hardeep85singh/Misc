package earlyJavaObjects.chapter4;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer between 1,000 and 999,999");
        String number = input.nextLine();

        if(number.length() == 7){
            System.out.println(number.substring(0,3)
                    + number.substring(4));
        } else if(number.length() ==6){
            System.out.println(number.substring(0,2)
            + number.substring(3));
        } else {
            System.out.println(number.substring(0,1)
            + number.substring(2));
        }

    }
}
