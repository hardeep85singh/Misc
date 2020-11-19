package earlyJavaObjects.chapter10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentViewer1 {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args) {
        BankAccount account = new BankAccount(INITIAL_BALANCE);

        JFrame frame = new JFrame();
        JButton button = new JButton("Add Interest");
        JLabel label = new JLabel("balance: " + account.getMeasure());
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        class AddInterestListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double interest = account.getMeasure() * INTEREST_RATE / 100;
                account.deposit(interest);
                label.setText("balance: " + account.getMeasure());
            }
        }

        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
