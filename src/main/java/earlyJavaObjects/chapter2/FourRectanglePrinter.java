package earlyJavaObjects.chapter2;

import javax.swing.*;
import java.awt.*;

public class FourRectanglePrinter extends JComponent {


    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(20,10);
        g2.draw(box);
        System.out.println(box.getLocation());
        box.translate(20,0);
        g2.draw(box);
        System.out.println(box.getLocation());
        box.translate(0,10);
        g2.draw(box);
        System.out.println(box.getLocation());
        box.translate(-20,0);
        g2.draw(box);
        System.out.println(box.getLocation());

    }

}
