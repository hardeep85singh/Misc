package earlyJavaObjects.chapter1;

public class P1_2Test {
    public static void main(String[]args){
       P1_2 fractionDistance1 = new P1_2(30, 20, 10, 300 );

       P1_2.totalWorkDistance(fractionDistance1.getWorkDays(), fractionDistance1.getOneWayWorkDistance());
    }


}
