package earlyJavaObjects.chapter1;

import javax.swing.*;

public class E1_17 {
    public static void main(String []args){
        String name = JOptionPane.showInputDialog("What is your name");
        System.out.println(name);
        JOptionPane.showMessageDialog(null, "What would you like me to do.");
        System.out.println("I am sorry, " + name +". I am afraid i can't do that.");
    }
}
