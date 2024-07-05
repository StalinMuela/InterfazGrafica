import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class form1 {
    public JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JLabel resultadotxt;
    private JLabel resultado1;
    private JLabel resultado2;
    private JButton BNombreButton;
    private JLabel promedio;

    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url  = "jdbc:mysql://localhost:3306/estudiantesA";
                String user = "root";
                String password = "123456";

                try (Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("CONECTADO A LA BASE DE DATOS");
                    String query = "SELECT * FROM estudiantes where cedula = '"+textField1.getText()+"'";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        resultadotxt.setText(resultSet.getString("nombre"));
                        resultado1.setText(resultSet.getString("b1"));
                        resultado2.setText(resultSet.getString("b2"));
                    }

                    double res1 = Double.parseDouble(resultado1.getText());
                    double res2 = Double.parseDouble(resultado2.getText());
                    double pro = (res1 + res2) / 2;
                    promedio.setText(String.valueOf(pro));
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                }

            }
        });
        BNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url  = "jdbc:mysql://localhost:3306/estudiantesA";
                String user = "root";
                String password = "123456";

                try (Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("CONECTADO A LA BASE DE DATOS");
                    String query = "SELECT * FROM estudiantes where nombre = '"+textField1.getText()+"'";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        resultadotxt.setText(resultSet.getString("cedula"));
                        resultado1.setText(resultSet.getString("b1"));
                        resultado2.setText(resultSet.getString("b2"));
                    }

                    double res1 = Double.parseDouble(resultado1.getText());
                    double res2 = Double.parseDouble(resultado2.getText());
                    double pro = (res1 + res2) / 2;
                    promedio.setText(String.valueOf(pro));
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                }

            }
        });
    }
}
