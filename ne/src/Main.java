import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url  = "jdbc:postgresql://localhost:3306/estudiantes2024A";
        String user = "root";
        String password = "123456";

        try (Connection connection= DriverManager.getConnection(url,user,password)){
            System.out.println("CONECTADO A LA BASE DE DATOS");
            String query = "SELECT * FROM estudiante";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getString("nombre"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}