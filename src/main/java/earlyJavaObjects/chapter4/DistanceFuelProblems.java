package earlyJavaObjects.chapter4;

import java.util.Scanner;

public class DistanceFuelProblems {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double gallons = input.nextDouble();
        double fuelEfficiency = input.nextDouble();
        double pricePerGallon = input.nextDouble();

        System.out.printf("%s%.2f%n", "Cost per 100 miles: "
                , pricePerGallon * 100/ fuelEfficiency );
        System.out.printf("%s%.2f", "Distance travelled: "
                , fuelEfficiency * gallons);
    }
}
