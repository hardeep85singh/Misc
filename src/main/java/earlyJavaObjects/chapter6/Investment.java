package earlyJavaObjects.chapter6;

public class Investment {
    private double balance;
    private double rate;
    private int year;

    public Investment(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
        year = 0;
    }
    public void waitForBalance(double targetBalance){
        while(balance < targetBalance){
            year++;
            double interest = balance * rate /100;
            balance = balance + interest;
        }
    }

    public void waitYears(int numOfYears){
        for (int i =0; i<= numOfYears; i++){
            double interest = balance * rate /100;
            balance = balance + interest;
        }
        year = year + numOfYears;
    }

    public double getBalance() {
        return balance;
    }
    public int getYears(){
        return year;
    }
}
