package earlyJavaObjects.chapter3;

public class BankAccount {
    private double balance;

    /**
     * Constructs a bank account with zero balance
     */
    public BankAccount(){
        balance =0;
    };

    /**
     * Constructs a bank account with a given balance
     * @param balance initial balance
     */
    public BankAccount(double balance){
        this.balance = balance;
    }

    /**
     * Deposits money in the bank account
     * @param amount the amount to deposit
     */
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    /**
     * Withdraws money from the bank account
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    /**
     * Shows the current account balance
     * @return the current balance
     */
    public double getBalance(){
        return balance;
    }
}
