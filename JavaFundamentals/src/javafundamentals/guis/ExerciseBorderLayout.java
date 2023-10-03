package javafundamentals.guis;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class ExerciseBorderLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise BorderLayout");
        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("Nome: ");
        JLabel saidaLabel = new JLabel("Esperando resultado...");
        JTextField entrada = new JTextField();
        
        panel.setLayout(new BorderLayout());
        panel.add(nameLabel, BorderLayout.WEST);
        panel.add(entrada, BorderLayout.CENTER);
        panel.add(saidaLabel, BorderLayout.SOUTH);
        
        entrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saidaLabel.setText("Hello Sr." + entrada.getText());
            }
        });
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
