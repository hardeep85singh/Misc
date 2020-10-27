package earlyJavaObjects.chapter2;

import javax.swing.*;
import java.awt.*;

public class TwoSquareComponent extends JComponent {
    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box1 = new Rectangle(10,10, 20,20);
        g2.draw(box1);
        Rectangle box2 = new Rectangle(10,10,30,30);
        g2.draw(box2);
    }
}
