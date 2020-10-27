package earlyJavaObjects.chapter5;

public class RomanNumbers {
    public static void main(String[]args){
        String thousand = "M";
        int num = 1978;

        System.out.println(getRomanNum(1978));


    }

    public static String getRomanNum(int num){
        String ones = "I";
        String fives = "V";
        String tens = "X";
        String fifty= "L";
        String hundred = "C";
        String fiveHundred = "D";
        String thousand = "M";

        String romanNum;
        if(num == 1){
            romanNum = ones;
        } else if(num == 2){
            romanNum = ones + ones;
        } else if (num == 3){
            romanNum = ones + ones;
        } else if (num == 4){
            romanNum = ones + fives;
        } else if (num == 5){
            romanNum = fives;
        } else if(num ==6){
            romanNum = fives +ones;
        } else if(num == 7){
            romanNum = fives + ones + ones;
        } else if (num ==8){
            romanNum = fives+ones+ones+ones;
        } else if(num == 9){
            romanNum = ones + tens;
        } else {
            romanNum = tens;
        }

        if (num% 1000 <= 3){
            return thousand + romanNum;
        } else if (num % 100 <=9){
            romanNum.replace("I", "C" );
            romanNum.replace("V", "D");
            romanNum.replace("X", "M");
            return romanNum;
        } else {
            romanNum.replace("I", "X");
            romanNum.replace("V", "L");
            romanNum.replace("X", "C");
            return romanNum;
        }

    }
}
