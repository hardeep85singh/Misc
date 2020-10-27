package earlyJavaObjects.chapter2;

public class LotteryPrinter {
    public static void main(String[]args){
        Random randNum = new Random(49);

        for(int i=0; i<6; i++) {
            System.out.println(randNum);
        }
    }

}
