package JavaEE.JavaWeb;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost",8090);
            Scanner scanner = new Scanner(System.in)){
            System.out.println("已连接到服务器！");
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            System.out.println("请输入要发送的数据：");
            writer.write(scanner.nextLine() + "\n");
            writer.flush();
            System.out.println("数据已发送！");

        } catch (IOException e) {
            System.out.println("连接服务器失败失败");
            e.printStackTrace();
        }
    }
}
