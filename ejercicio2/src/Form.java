import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    public JPanel panel1;
    private JButton OK;
    private JButton borrar;
    private JTextField label1;
    private JPasswordField label2;
    private JLabel txt1;
    private JLabel txt2;

    public Form() {
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num2 = Integer.parseInt(label2.getText());
                String pass = String.valueOf(label1.getText());
                String usuari = "David";
                int contraseña = 123;
                if (num2 == contraseña && pass.equals(usuari)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                }else{
                    JOptionPane.showMessageDialog(null, "No valido usted se olvido su datos");

                }
            }
        });
    }
}
