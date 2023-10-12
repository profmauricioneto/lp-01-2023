/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals.guis.forms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public final class ProgramSwingForm extends JFrame {
    
    JLabel lblFname, lblLname,lblAge, lblOutput;
    JTextField tfFname, tfLname, tfAge;
    JButton btnClear, btnSend;
    JPanel pnlPersonalData, pnlButtons, pnlOutput;

    public ProgramSwingForm() {
        super("My Swing Program!");
        
        lblFname = new JLabel("First Name");
        lblLname = new JLabel("Last Name");
        lblAge = new JLabel("Age");
        lblOutput = new JLabel("");
        tfFname = new JTextField();
        tfLname = new JTextField();
        tfAge = new JTextField();
        btnClear = new JButton("Clear");
        btnSend = new JButton("Send");
        lblOutput = new JLabel("");
        
        initUI();
        
        setLayout(new GridLayout(3,1));
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public void initUI() {
        pnlPersonalData = new JPanel();
        pnlPersonalData.setLayout(new GridLayout(6,1));
        
        pnlPersonalData.add(lblFname);
        pnlPersonalData.add(tfFname);
        pnlPersonalData.add(lblLname);
        pnlPersonalData.add(tfLname);
        pnlPersonalData.add(lblAge);
        pnlPersonalData.add(tfAge);
        pnlPersonalData.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlPersonalData.setBorder(BorderFactory.createLineBorder(Color.RED)
        );
        add(pnlPersonalData);
        
        pnlButtons = new JPanel();
        pnlButtons.setLayout(new FlowLayout());
        
        pnlButtons.add(btnClear);
        pnlButtons.add(btnSend);
        pnlButtons.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlButtons.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        btnClear.addActionListener(new ClearAction());
        btnSend.addActionListener(new SendAction());
        
        add(pnlButtons);
        
        pnlOutput = new JPanel();
        pnlOutput.setLayout(new GridLayout(1,1));
        pnlOutput.add(lblOutput);
        pnlOutput.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlOutput.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        add(pnlOutput);
    }
    
    public boolean verifyFields(String fname, String lname, String age) {
        boolean flag = false;
        if(fname.isEmpty()) {
           String firstName = JOptionPane.showInputDialog(null, "First Name", "Incomplete Input", 1);
           tfFname.setText(firstName);
           flag = true;
        }
        if(lname.isEmpty()) {
            String lastName = JOptionPane.showInputDialog(null, "Last Name", "Incomplete Input", 1);
            tfLname.setText(lastName);
            flag = true;
        }
        if(age.isEmpty()) {
            String myAge = JOptionPane.showInputDialog(null, "Age", "Incomplete Input", 1);
            tfAge.setText(myAge);
            flag = true;
        }
        return flag;
    }
    
    private class ClearAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tfFname.setText("");
            tfLname.setText("");
            tfAge.setText("");
        }
        
    }
    
    private class SendAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();
            if (!verifyFields(fname, lname, age)){
                String output = "Hello! Mr(s) ".concat(fname).concat(" ").concat(lname).concat("! You have ").concat(age).concat(" years old!");
                lblOutput.setText(output);              
            }
        }
    }

    
    public static void main(String[] args) {
        ProgramSwingForm program = new ProgramSwingForm();
    }
}
