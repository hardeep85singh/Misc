package earlyJavaObjects.chapter2;

public class PointTester {
    public static void main(String[]args){
        Point p1 = new Point(3,4);
        Point p2 = new Point(-3,-4);

        System.out.println(Point.distance(3,4,-3,-4));
        System.out.println(Point.distance(p1,p2));
    }
}
