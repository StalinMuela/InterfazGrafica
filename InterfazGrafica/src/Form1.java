import javax.swing.*;

public class Form1 extends JFrame {
    private JButton ingresaAquiButton;

    public Form1() {
        setTitle("Form 1");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    private void createUIComponents() {
        System.out.println("Creando un Button");
    }
}
