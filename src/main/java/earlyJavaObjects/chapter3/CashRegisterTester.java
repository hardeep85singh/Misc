package earlyJavaObjects.chapter3;

public class CashRegisterTester {
    public static void main(String[]args){
        CashRegister register = new CashRegister();

//        register.recordPurchase(0.75);
//        register.recordPurchase(1.5);
//        register.receivePayment(2,0,5,0,0);
//        System.out.print("Change: ");
//        System.out.println(register.giveChange());
//        System.out.println("Expected: 0.25");

        register.recordPurchase(20.37);
        register.enterDollars(20);
        register.enterQuarters(2);
        System.out.println("Change: " + register.giveChange());
        System.out.println("Expected: 0.13");

    }
}
