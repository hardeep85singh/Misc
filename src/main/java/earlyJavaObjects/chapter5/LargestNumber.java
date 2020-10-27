package earlyJavaObjects.chapter5;

public class LargestNumber {
    public static void main(String []args){
//        float num1;
//        float num2;
//        float num3;

        System.out.println(largestNum(4,9,2.5f));

    }

    public static float largestNum(float num1, float num2, float num3){
        if(num1 >= num2 && num1 >= num3){
            return num1;
        }else if (num1 <= num2 && num2 >= num3){
            return num2;
        } else {
            return num3;
        }

    }
}
