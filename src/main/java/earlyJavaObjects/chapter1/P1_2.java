package earlyJavaObjects.chapter1;

public class P1_2 {
   private int totalDays;
   private int workDays;
   private double oneWayWorkDistance;
   private double totalDistance;

   public P1_2(){

   }

   public P1_2(int totalDays, int workDays, double oneWayWorkDistance
   , double totalDistance){
       if (totalDays < 0){
           throw new IllegalArgumentException(
                   "Total days must be greater than 0."
           );
       }
       if (workDays < 0){
           throw new IllegalArgumentException(
                   "Total work days must be greater than 0."
           );
       }
       if (oneWayWorkDistance < 0){
           throw new IllegalArgumentException(
                   "One way work distance must be greater than 0."
           );
       }
       if (totalDistance < 0){
           throw new IllegalArgumentException(
                   "Total distance must be greater than 0."
           );
       }
       if (totalDays < workDays){
           throw new IllegalArgumentException(
                   "Total days must be greater than or equal to work days."
           );
       }
       if (totalDistance < oneWayWorkDistance){
           throw new IllegalArgumentException(
                   "Total distance must be greater than one way work distance"
           );
       }
       this.totalDays = totalDays;
       this.workDays = workDays;
       this.oneWayWorkDistance = oneWayWorkDistance;
       this.totalDistance = totalDistance;
   }
   public int getTotalDays(){
       return totalDays;
   }
   public int getWorkDays(){
       return workDays;
   }
   public double getOneWayWorkDistance(){
       return  oneWayWorkDistance;
   }
   public double getTotalDistance(){
       return totalDistance;
   }
   public void setTotalDays(int totalDays) {
       if (totalDays < 0) {
           throw new IllegalArgumentException(
                   "Total days must be greater than 0."
           );
       }
       this.totalDays = totalDays;
   }

    public void setWorkDays(int workDays) {
       if(workDays < 0){
           throw new IllegalArgumentException(
                   "Total work days must be greater than 0."
           );
       }
       this.workDays = workDays;
    }

    public void setOneWayWorkDistance(double oneWayWorkDistance) {
        this.oneWayWorkDistance = oneWayWorkDistance;
    }

    public void setTotalDistance(double totalDistance) {
       if (totalDistance < 0){
           throw new IllegalArgumentException(
                   "Total distance must be greater than 0."
           );
       }
       if (totalDistance < totalWorkDistance(getWorkDays(), getOneWayWorkDistance())){
           throw new IllegalArgumentException(
                   "Total distance can not be less than total work distance."
           );
       }
        this.totalDistance = totalDistance;
    }

    public static double totalWorkDistance(int workDays, double oneWayWorkDistance){
       return 2 * oneWayWorkDistance * workDays;
    }
}
