package earlyJavaObjects.chapter6;

public class CreditCardNumber {
    public static void main(String[]args){
        String creditCardNumber = "4134-4552-5342-1412";

        int i = 0;
        while (i < creditCardNumber.length()){
            char ch = creditCardNumber.charAt(i);
            if (ch== ' ' || ch == '-'){
                String before = creditCardNumber.substring(0,i);
                String after = creditCardNumber.substring(i+1 );
                creditCardNumber = before + after;
            }
            else {
                i++;
            }
        }
        System.out.println(creditCardNumber);
    }
}
