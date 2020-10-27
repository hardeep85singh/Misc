package earlyJavaObjects.chapter5;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your income: ");
        double income = input.nextDouble();

        System.out.println("Are your married? (Y/N) ");
        String str = input.next();

        int status;
        if(str.equals("Y")){
            status = TaxReturn.MARRIED;
        } else {
            status = TaxReturn.SINGLE;
        }

        TaxReturn taxReturn = new TaxReturn(income, status);

        System.out.println("Tax: " + taxReturn.getTax());
    }
}
