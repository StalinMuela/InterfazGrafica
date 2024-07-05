import java.sql.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String url  = "jdbc:mysql://localhost:3306/estudiantesA";
        String user = "root";
        String password = "123456";

        String nombre = "David Muela";
        String cedula = "1753175385";
        Double b1 = 12.12;
        Double b2 = 14.89;

        String sql = "INSERT INTO estudiantes(cedula, nombre, b1, b2) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url,user,password)){
            PreparedStatement cadena = connection.prepareStatement(sql);
            cadena.setString(1,cedula);
            cadena.setString(2,nombre);
            cadena.setDouble(3,b1);
            cadena.setDouble(4,b2);

            cadena.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}