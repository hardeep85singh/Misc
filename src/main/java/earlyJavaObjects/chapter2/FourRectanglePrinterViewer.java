package earlyJavaObjects.chapter2;

import javax.swing.*;

public class FourRectanglePrinterViewer {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FourRectanglePrinter newRectangles = new FourRectanglePrinter();

        frame.add(newRectangles);
        frame.setVisible(true);
    }
}
