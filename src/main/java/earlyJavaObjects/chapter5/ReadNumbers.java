package earlyJavaObjects.chapter5;

public class ReadNumbers {
    public static void main(String[] args) {

        int firstNum = 3;
        int secondNum = 3;
        int thirdNum = 5;
        int fourthNum = 5;
        checkEquality(firstNum, secondNum, thirdNum);
        numOrder(firstNum, secondNum, thirdNum);
        numInOrder(firstNum, secondNum, thirdNum);
        twoPairs(firstNum, secondNum, thirdNum, fourthNum);
    }

    public static void checkEquality(int firstNum,
                                     int secondNum, int thirdNum) {
        if (firstNum == secondNum && firstNum == thirdNum) {
            System.out.println("All the same");
        } else if (firstNum != secondNum && firstNum != thirdNum) {
            System.out.println("All different");
        } else {
            System.out.println("neither");
        }
    }

    public static void numOrder(int firstNum, int secondNum, int thirdNum) {
        if (firstNum > secondNum && secondNum > thirdNum) {
            System.out.println("Increasing");
        } else if (firstNum < secondNum && secondNum < thirdNum) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }

    public static void numInOrder(int firstNum, int secondNum, int thirdNum) {
        if ((firstNum >= secondNum && secondNum >= thirdNum) ||
                (firstNum <= secondNum && secondNum <= thirdNum)) {
            System.out.println("In Order");
        } else {
            System.out.println("Not in order");
        }
    }

    public static void twoPairs(int first, int second, int third, int fourth) {
        if ((first == second && first == third && first == fourth)
                || (first == second && third == fourth)
                || (first == third && second == fourth)
                || (first == fourth && second == third)) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }
    }

}
