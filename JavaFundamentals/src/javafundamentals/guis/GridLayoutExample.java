package javafundamentals.guis;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author maumneto
 */
public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame =  new JFrame("GridLayout Example");
        JPanel panelNumbers = new JPanel();
        JPanel panelZero = new JPanel();
        
        panelZero.setLayout(new GridLayout(1,1));
        panelNumbers.setLayout(new GridLayout(3,3));
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        
        panelNumbers.add(btn9);
        panelNumbers.add(btn8);
        panelNumbers.add(btn7);
        panelNumbers.add(btn6);
        panelNumbers.add(btn5);
        panelNumbers.add(btn4);
        panelNumbers.add(btn3);
        panelNumbers.add(btn2);
        panelNumbers.add(btn1);
        
        panelZero.add(btn0);
        
        frame.add(panelNumbers, BorderLayout.CENTER);
        frame.add(panelZero, BorderLayout.SOUTH);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}
