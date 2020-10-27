package earlyJavaObjects.chapter2;

import javax.swing.*;

public class EmptyFrameViewer {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
