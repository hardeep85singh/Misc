package earlyJavaObjects.chapter3;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class CashRegister {
    public static final double QUARTER_VALUE =0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    private double purchase;
    private double payment;
    private double dollars;
    private double quarters;
    private double dimes;
    private double nickels;
    private double pennies;

    /**
     * Constructs a cash register with no money in it
     */
    public CashRegister(){

    }

    /**
     * Records the purchase price of an item.
     * @param amount the price of the item
     */
    public void recordPurchase(double amount){
        purchase = purchase + amount;
    }

    /**
     * Processes the payment received from the customer.
     * @param dollars the number of dollars in the payment
     * @param quarters the number of quarters in the payment
     * @param dimes the number of dimes in the payment
     * @param nickels the number of nickels in the payment
     * @param pennies the number of pennies in the payment
     */
    public double receivePayment(double dollars, double quarters,
    double dimes, double nickels, double pennies){
        payment = this.dollars
                + this.quarters * QUARTER_VALUE
                + this.dimes * DIME_VALUE
                + this.nickels * NICKEL_VALUE
                + this.pennies * PENNY_VALUE;
        return payment;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */
    public double giveChange(){
        double change = receivePayment(dollars, quarters, dimes, nickels, pennies)
                - purchase;
        payment = 0;
        purchase = 0;
        return change;
    }

    public void enterDollars(double dollars){
        this.dollars = dollars;
    }
    public void enterQuarters (double quarters){
        this.quarters = quarters;
    }
    public void enterDimes (double dimes){
        this.dimes = dimes;
    }
    public void enterNickels (double nickels){
        this.nickels = nickels;
    }
    public void enterPennies (double pennies){
        this.pennies = pennies;
    }

}
