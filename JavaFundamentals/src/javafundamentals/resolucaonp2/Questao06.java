package javafundamentals.resolucaonp2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;


public class Questao06 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Questao06");
        JLabel result = new JLabel("");
        JTextField entry = new JTextField();
        JButton button = new JButton("OK");
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3, 1));
        panel.add(entry);
        panel.add(button);
        panel.add(result);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String text = entry.getText();
                result.setText(text);
                entry.setText("");
            }
        });

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
