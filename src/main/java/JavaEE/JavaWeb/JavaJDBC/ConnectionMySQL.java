package JavaEE.JavaWeb.JavaJDBC;

import java.sql.*;

public class ConnectionMySQL {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Re4030dd.");

            Statement statement = connection.createStatement()){
            ResultSet set = statement.executeQuery("SELECT * from Score order by Name DESC ");

            while(set.next()){

                System.out.print(set.getString(1) + " ");
                System.out.println(set.getInt(2));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } ;
    }
}
