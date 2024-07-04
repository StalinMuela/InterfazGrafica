import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

public class form {
    private JButton button1;
    public JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField1;

    public form() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url  = "jdbc:mysql://localhost:3306/estudiantes2024A";
                String user = "root";
                String password = "123456";

                try (Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("CONECTADO A LA BASE DE DATOS");
                    String query = "SELECT * FROM estudiante";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    //PARA BUSCAR
                    int cedulas =

                    while (resultSet.next()) {
                        if (resultSet.getString("cedula").equals(cedulas)) {
                            double nota1 = Double.parseDouble(resultSet.getString("bimestreUno"));
                            double nota2 = Double.parseDouble(resultSet.getString("bimestreDos"));
                            label1.setText(resultSet.getString("nombre"));
                            label2.setText(resultSet.getString("bimestreUno"));
                            label3.setText(resultSet.getString("bimestreDos"));
                            double promedio = (nota1 + nota2) / 2;

                            if (promedio > 14) {
                                label4.setText(promedio + "Pasa");
                            } else {
                                label4.setText(promedio + "Reprueba");
                            }
                        }
                    }
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                }

            }
        });
    }
}
