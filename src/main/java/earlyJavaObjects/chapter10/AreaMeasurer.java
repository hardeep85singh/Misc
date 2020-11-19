package earlyJavaObjects.chapter10;

import java.awt.*;

public class AreaMeasurer implements Measurer{
    @Override
    public double measure(Object anObject) {
        Rectangle rectangle = (Rectangle) anObject;
        double area = rectangle.getWidth() * rectangle.getHeight();
        return area;
    }

}
