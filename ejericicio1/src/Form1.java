import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    public JPanel panel1;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField label1;
    private JTextField label2;
    private JLabel txt;

    public Form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(label1.getText());
                Double num2 = Double.parseDouble(label2.getText());
                txt.setText(String.valueOf(num1 + num2));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(label1.getText());
                Double num2 = Double.parseDouble(label2.getText());
                System.out.println("Resta");
                txt.setText(String.valueOf(num1 - num2));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(label1.getText());
                Double num2 = Double.parseDouble(label2.getText());
                System.out.println("Multiplicacion");
                txt.setText(String.valueOf(num1 * num2));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(label1.getText());
                Double num2 = Double.parseDouble(label2.getText());
                System.out.println("Division");
                if(num2 == 0){
                    txt.setText("IMPOSIBLE DIVIR PARA 0");
                }else{
                    txt.setText(String.valueOf(num1 / num2));
                }
            }
        });
    }
}
