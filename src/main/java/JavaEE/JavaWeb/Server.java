package JavaEE.JavaWeb;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8090)){
            System.out.println("正在等待客户端连接……");

            Socket socket = server.accept();
            System.out.println("客户端已连接，IP地址为：" + socket.getInetAddress().getHostAddress());

            //InputStream in = new socket.getInputStream();


            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());

            writer.write("HTTP/1.1 200 Accepted\r\n");
            writer.write("\r\n");
            writer.write("zprlyl");
            writer.flush();
            socket.close();

//            System.out.println("读取客户端数据……");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//            System.out.println(reader.readLine());
//

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
