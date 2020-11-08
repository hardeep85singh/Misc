package earlyJavaObjects.chapter9;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double minBalance;

    public SavingsAccount(){
        super();
    }
    public void setInterestRate(double rate){

    }
    public void withdraw(double amount){
        super.withdraw(amount);
        double balance = getBalance();
        if(balance < minBalance){
            minBalance = balance;
        }
    }
    public void monthEnd(){
        double interest = minBalance * interestRate / 100;
        deposit(interest);
        minBalance = getBalance();
    }
}
