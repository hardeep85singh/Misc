package earlyJavaObjects.chapter2;

import javax.swing.*;

public class TwoSquareViewer {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.setTitle("Two Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent twoSquare = new TwoSquareComponent();
        frame.add(twoSquare);
        frame.setVisible(true);
    }

}
