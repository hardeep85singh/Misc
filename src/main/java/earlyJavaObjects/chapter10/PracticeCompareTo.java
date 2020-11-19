package earlyJavaObjects.chapter10;

public class PracticeCompareTo {
    public static void main(String[]args){
        double a = 0.6;
        double b = 0.3;

        System.out.println((int)(a-b));
        System.out.println((int)(b-a));
        System.out.println(Double.compare(a,b));
    }
}
