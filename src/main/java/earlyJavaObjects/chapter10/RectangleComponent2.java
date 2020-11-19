package earlyJavaObjects.chapter10;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent2 extends JComponent {
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;

    private Rectangle box;

    public RectangleComponent2(){
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }

    public void moveRectangleTo(int x, int y){
        box.setLocation(x,y);
        repaint();
    }

}
