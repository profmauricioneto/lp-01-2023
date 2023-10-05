/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals.guis;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class JtextfieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextfield Example");
        JPanel panel = new JPanel();
        JPanel btnPanel = new JPanel();
        
        JLabel fnameLabel = new JLabel("First Name: ");
        JLabel lnameLabel = new JLabel("Last Name: ");
        JLabel ageLabel = new JLabel("Age: ");
        JTextField fnameTf = new JTextField(20);
        JTextField lnameTf = new JTextField(20);
        JTextField ageTf = new JTextField(20);
        JLabel result = new JLabel("");
        JButton btnClear = new JButton("Clear");
        JButton btnSend = new JButton("Send");
        
        btnPanel.add(btnClear);
        btnPanel.add(btnSend);
        
        btnPanel.setLayout(new GridLayout(1, 2));
        panel.setLayout(new GridLayout(8, 1));
        panel.add(fnameLabel);
        panel.add(fnameTf);
        panel.add(lnameLabel);
        panel.add(lnameTf);
        panel.add(ageLabel);
        panel.add(ageTf);
        panel.add(btnPanel);
        panel.add(result);
        
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fnameTf.setText("");
                lnameTf.setText("");
                ageTf.setText("");
            }
        });
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
