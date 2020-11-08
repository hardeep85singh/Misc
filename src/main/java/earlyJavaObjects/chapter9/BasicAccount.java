package earlyJavaObjects.chapter9;

public class BasicAccount extends BankAccount{
    double balance = getBalance();
    private final double PENALTY = 30;

    public BasicAccount(){
        super();
    }

    public void withdraw(double amount){
//        double balance = 0;
        if(getBalance() > amount){
            balance = getBalance() -  amount;
        } else {
            balance = 0;
        }
    }
}
