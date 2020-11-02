package earlyJavaObjects.chapter6;

public class NumberSquare {
    public static void main(String[] args) {

        squareNum(10);
        divisible(100);

    }

    public static void divisible(int n) {

        for (int i = 0; i < n; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");

            }
        }
    }

    public static void squareNum(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(i * i + " ");
        }

    }

    public static int sumEvenNums(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public int sumOfSquares(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= Math.sqrt(num2); i++) {
            sum = sum + num1 * num1;
        }
        return sum;
    }


}
