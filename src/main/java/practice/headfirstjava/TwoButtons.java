package practice.headfirstjava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[]args){
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        LabelListener labelListener = new LabelListener();
        labelButton.addActionListener(labelListener);

        JButton colorButton = new JButton("Change Circle");
        ColorListener colorListener = new ColorListener();
        colorButton.addActionListener(colorListener);

        label = new JLabel("I am label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setSize(300,300);
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            label.setText("Ouch");
        }
    }

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }
}
