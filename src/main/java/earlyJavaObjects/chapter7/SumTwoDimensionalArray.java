package earlyJavaObjects.chapter7;

public class SumTwoDimensionalArray {
    public static void main(String[] args) {
        double[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumArray(arr));
    }

    public static double sumArray(double[][] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
