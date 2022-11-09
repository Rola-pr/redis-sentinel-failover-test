package JavaEE.JavaWeb;

import com.mysql.cj.jdbc.StatementImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class FileTransfer {
    public static void main(String[] args) throws SQLException {
        try(Socket socket = new Socket("localhost",9090)){
            FileInputStream fileInputStream = new FileInputStream("./sendToServer");
            OutputStream outputStream = socket.getOutputStream();

            byte[] bytes = new byte[1024];

            int i;

            while ((i = fileInputStream.read(bytes)) != -1){

            }

        } catch (IOException e) {
            System.out.println("连接失败……");
            e.printStackTrace();
        }


        try (Connection connection = DriverManager.getConnection("");

             Statement statement = connection.createStatement()){
                 ResultSet set = statement.executeQuery("SELECT * from TABLE (  )");

                 while (set.next()){

                 }

        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
