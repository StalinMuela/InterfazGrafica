import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {

    public JPanel panel1;
    private JButton button1;
    private JLabel Nombrelbl;
    private JButton borrarButton;
    private JTextField label;
    private JButton capturarButton;


    public Form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombrelbl.setText("Hola ! , Mi nombre es David");
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombrelbl.setText("Ingresa un texto");
            }
        });
        capturarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombrelbl.setText(label.getText());
            }
        });
    }

}
