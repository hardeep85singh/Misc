package earlyJavaObjects.chapter5;
import java.util.Scanner;
public class ElevatorSimulation2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Floor: ");

        if(input.hasNextInt()){
            int floor = input.nextInt();

            if(floor ==13){
                System.out.println("Error: There is no thirteenth floor.");
            } else if (floor <=0 || floor >=20){
                System.out.println("Error: Th floor must be in between 1 and 20");
            } else{
                int actualFloor = floor;
                if (floor> 13){
                    actualFloor = floor-1;

                }
                System.out.println("The elevator will travel to the actual floor"
                        + actualFloor);
            }
        } else {
            System.out.println("Error: Not an Integer");
        }

    }
}
