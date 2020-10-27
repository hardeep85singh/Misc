package earlyJavaObjects.chapter2;

import java.awt.*;

public class PerimeterTester {
    public static void main(String[]args){
        Rectangle rectangle = new Rectangle(10,20);

        Double perimeter = 2 * (rectangle.getWidth()+rectangle.getHeight());
        System.out.println(perimeter);
    }
}
