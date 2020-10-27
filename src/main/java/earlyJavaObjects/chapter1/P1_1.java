package earlyJavaObjects.chapter1;

public class P1_1 {

    public static void main(String[]args){
      double distance;
      double trainTicketPrice;
      double gasCost =4;
      double carMaintenance = 5;
      double fuelEfficiency;

      System.out.println(carOrTrain(2,

              carCommuteCost(10, gasCost, carMaintenance, 10)));

    }

    public static double carCommuteCost(double distance, double gasCost, double carMaintenance
    , double fuelEfficiency){
      double carCost = (distance * gasCost/fuelEfficiency) + (distance * carMaintenance /100);
      return carCost;
    }

    public static String carOrTrain(double trainTicketPPrice, double carCommuteCost){
        if (trainTicketPPrice < carCommuteCost){
            return "Train commute is cheaper";
        } else {
            return "Car commute is cheaper";
        }
    }
}
