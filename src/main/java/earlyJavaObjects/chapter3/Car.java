package earlyJavaObjects.chapter3;

import earlyJavaObjects.chapter2.Point;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car {
    private int xLeft;
    private int yTop;

    /**
     * Constructs a car with a given top left corner
     * @param x the x-coordinate pf the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Car(int x, int y){
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * Draws the car
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2){
        Rectangle body = new Rectangle(xLeft,yTop+10,60,10);
        Ellipse2D.Double frontTire =
                new Ellipse2D.Double(xLeft+10, yTop+20,10,10);
        Ellipse2D.Double rearTire =
                new Ellipse2D.Double(xLeft+40, yTop+20,10,10);

        // The Bottom of front windshield
        Point2D.Double r1 = new Point2D.Double(xLeft+10,yTop+10);
        //The Front of the roof
        Point2D.Double r2 = new Point2D.Double(xLeft+20, yTop);
        //The Rear of the roof
        Point2D.Double r3 = new Point2D.Double(xLeft+40, yTop);
        //The Bottom of rear rear windshield
        Point2D.Double r4 = new Point2D.Double(xLeft+50, yTop+10);

        Line2D.Double frontWindShield = new Line2D.Double(r1,r2);
        Line2D.Double roofTop = new Line2D.Double(r2,r3);
        Line2D.Double rearWindShield = new Line2D.Double(r3,r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindShield);
        g2.draw(roofTop);
        g2.draw(rearWindShield);

    }
}
