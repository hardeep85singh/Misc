package earlyJavaObjects.chapter5;

import earlyJavaObjects.chapter2.Random;

public class TaxReturn {
    public static final int SINGLE  = 1;
    public static final int MARRIED = 2;

    private static final double RATE1 = 0.10;
    private static final double RATE2 = 0.15;
    private static final double RATE3 = 0.25;
    private static final double RATE1_SINGLE_LIMIT = 8000;
    private static final double RATE2_SINGLE_LIMIT = 32000;
    private static final double RATE1_MARRIED_LIMIT = 16000;
    private static final double RATE2_MARRIED_LIMIT = 64000;

    private double income;
    private int status;

    /**
     * Constructs a TaxReturn object for a give income
     * and marital status
     * @param income the  taxpayer income
     * @param status single or married
     */
    public TaxReturn(double income, int status){
        this.income = income;
        this.status = status;
    }

    public double getTax(){
        double tax1 = 0;
        double tax2 = 0;
        double tax3 = 0;
        if(status == SINGLE){
            if(income <= RATE1_SINGLE_LIMIT){
                tax1 = income * RATE1;
            } else if (income <= RATE2_SINGLE_LIMIT){
                tax1 = RATE1_SINGLE_LIMIT * RATE1;
                tax2 = (income - RATE1_SINGLE_LIMIT) * RATE2;
            } else {
                tax1= RATE1_SINGLE_LIMIT *RATE1;
                tax2 = (RATE2_SINGLE_LIMIT - RATE1_SINGLE_LIMIT) * RATE2;
                tax3 = (income - RATE2_SINGLE_LIMIT) * RATE3;
            }
        } else {
            if(income <= RATE1_MARRIED_LIMIT){
                tax1 = income * RATE1;
            } else if(income <= RATE2_MARRIED_LIMIT) {
                tax1 = RATE1_MARRIED_LIMIT * RATE1;
                tax2 = (income - RATE1_MARRIED_LIMIT) * RATE2;
            } else {
                tax1 = RATE1_MARRIED_LIMIT * RATE1;
                tax2 = (RATE2_MARRIED_LIMIT - RATE1_MARRIED_LIMIT) * RATE2;
                tax3 = (income - RATE2_MARRIED_LIMIT) * RATE3;
            }
        }
        return tax1 + tax2 + tax3;
    }

}
