package earlyJavaObjects.chapter10;

public class BankAccount implements Measurable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
