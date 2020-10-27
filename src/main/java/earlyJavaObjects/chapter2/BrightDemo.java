package earlyJavaObjects.chapter2;

import javax.swing.*;
import java.awt.*;

public class BrightDemo {

    public static void main(String[]args){
        Color myColor = new Color(100,100,100);
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.setTitle("Bright demo");
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
