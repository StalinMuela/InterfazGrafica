import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /*
        String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma,"Suma", JOptionPane.PLAIN_MESSAGE);
        */

        JFrame frame = new JFrame("Mi aplicacion");
        frame.setContentPane(new Form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.pack();
        frame.setVisible(true);


    }

}