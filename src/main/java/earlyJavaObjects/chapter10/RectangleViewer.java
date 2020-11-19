package earlyJavaObjects.chapter10;

import javax.swing.*;

public class RectangleViewer {
    public static void main(String[]args){
        JFrame frame = new RectangleFrame();
        frame.setTitle("An Animated Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
