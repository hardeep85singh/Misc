package earlyJavaObjects.chapter2;

import java.awt.*;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Double area = rectangle.getHeight()* rectangle.getWidth();
        System.out.println(area);

    }
}