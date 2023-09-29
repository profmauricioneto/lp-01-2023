/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals.guis;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author maumneto
 */
public class HelloWorldSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        JLabel helloLabel = new JLabel("Hello World From GUI!");
        frame.add(helloLabel);
        frame.setLayout(null);
        helloLabel.setBounds(30, 20, 200, 20);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
