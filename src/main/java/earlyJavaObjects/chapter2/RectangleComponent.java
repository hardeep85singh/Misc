package earlyJavaObjects.chapter2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class RectangleComponent extends JComponent {
    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(5,10,20,30);
        g2.draw(box);
        box.translate(15,25);
        g2.draw(box);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(5,10,20,10);
        g2.draw(ellipse);
        Line2D.Double segment = new Line2D.Double(40,50, 60,90);
        g2.draw(segment);
        g2.drawString("Hello Hardeep", 50,100);
        g2.setColor(Color.BLUE);
        g2.draw(ellipse);
        g2.fill(ellipse);


    }
}
