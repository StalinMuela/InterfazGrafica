import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mi aplicacion");
        frame.setContentPane(new Form1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2500, 2000);
        frame.pack();
        frame.setVisible(true);
    }
}