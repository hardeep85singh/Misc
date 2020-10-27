package earlyJavaObjects.chapter6;

public class InvestmentRunner {
    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;
        final int YEARS = 20;
        Investment invest = new Investment(INITIAL_BALANCE, RATE);
        invest.waitForBalance(2 * INITIAL_BALANCE);
        int years = invest.getYears();
        System.out.println("The investment doubled after "
                + years + " years");

        Investment invest1 = new Investment(INITIAL_BALANCE, RATE);
        invest1.waitYears(YEARS);
        double balance = invest.getBalance();
        System.out.printf("The balance after %d years is %.2f%n", YEARS, balance);

    }
}
