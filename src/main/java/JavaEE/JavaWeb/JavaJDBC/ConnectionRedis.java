package JavaEE.JavaWeb.JavaJDBC;

import redis.clients.jedis.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionRedis {
    public static void main(String[] args) {
        try (Connection connection = (Connection) DriverManager.getConnection("", "", "")) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
