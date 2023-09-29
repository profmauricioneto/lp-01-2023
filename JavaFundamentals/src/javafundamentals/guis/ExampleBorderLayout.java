/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals.guis;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author maumneto
 */
public class ExampleBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layoout");
        JPanel panel = new JPanel();
        
        JButton buttonNorth = new JButton("North");
        JButton buttonSouth = new JButton("South");
        JButton buttonEast = new JButton("East");
        JButton buttonWest = new JButton("West");
        JButton buttonCenter = new JButton("Center");
        
        panel.setLayout(new BorderLayout());
        panel.add(buttonNorth, BorderLayout.NORTH);
        panel.add(buttonSouth, BorderLayout.SOUTH);
        panel.add(buttonEast, BorderLayout.EAST);
        panel.add(buttonWest, BorderLayout.WEST);
        panel.add(buttonCenter, BorderLayout.CENTER);
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
