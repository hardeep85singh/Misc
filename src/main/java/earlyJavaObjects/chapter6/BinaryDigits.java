package earlyJavaObjects.chapter6;

public class BinaryDigits {
    public static void main(String[]args){
      binaryDigits(13);
    }

    public static void binaryDigits(int num){

        while(num != 0){
            System.out.println(num %2);
            num = num /2;
        }
    }
}
