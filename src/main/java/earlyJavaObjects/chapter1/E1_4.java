package earlyJavaObjects.chapter1;

public class E1_4 {

    double principle;
    double rate;
    int years;
    static double compoundedAmount;
    public static void main(String[]args){
        System.out.println(compoundInterest(1000, .05, 1));
        System.out.println(compoundInterest(1000, .05, 2));
        System.out.println(compoundInterest(1000, .05, 3));
    }

    public static double compoundInterest(double principle, double rate, int years){
        compoundedAmount = principle * Math.pow((1+rate), years);
        return compoundedAmount;
    }
}
