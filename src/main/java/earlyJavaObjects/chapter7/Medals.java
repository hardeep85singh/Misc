package earlyJavaObjects.chapter7;

public class Medals {
    public static void main(String[] args) {
        final int COUNTRIES = 8;
        final int MEDALS = 3;

        String[] countries = {"Canada", "Italy", "Germany",
                "Japan", "India", "Russia", "USA", "England"};

        int[][] counts = {
                {0, 3, 0},
                {0, 0, 1},
                {0, 0, 1},
                {1, 0, 0},
                {0, 0, 1},
                {3, 1, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        System.out.println("      Country    Gold   Silver   Bronze    Total");

        for (int i = 0; i < COUNTRIES; i++) {
            System.out.printf("%15s", countries[i]);
            int total = 0;
            for (int j = 0; j < MEDALS; j++) {
                System.out.printf("%8d", counts[i][j]);
                total = total + counts[i][j];
            }
            System.out.printf("%8d%n", total);
        }


    }
}
