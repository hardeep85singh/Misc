package earlyJavaObjects.chapter6;

public class PowerTable {
    public static void main(String[] args) {
        int numOfRows = 10;
        int numOfColumns = 4;

        for (int i = 0; i < numOfColumns; i++) {
            System.out.printf("%10d", i);
        }
        System.out.println();

        for (int i = 0; i < numOfColumns; i++) {
            System.out.printf("%10s", "x ");
        }

        System.out.println();
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                double num = Math.pow(i, j);
                System.out.printf("%10.0f", num);
            }
            System.out.println();
        }
    }
}
