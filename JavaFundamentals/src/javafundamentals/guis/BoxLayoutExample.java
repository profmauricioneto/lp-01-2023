/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals.guis;

import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author maumneto
 */
public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame =  new JFrame("BoxLayout Example");
        Box horizon = Box.createVerticalBox();
        
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        
        horizon.add(btn0);
        horizon.add(btn1);
        horizon.add(btn2);
        horizon.add(btn3);
        horizon.add(btn4);
        horizon.add(btn5);
        horizon.add(btn6);
        
        frame.add(horizon);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
