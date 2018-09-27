package network.tcp_socket;

import java.io.IOException;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args)throws IOException {
        //客户端请求与本机在20006端口建立tcp连接
        Socket client=new Socket("127.0.0.1",20006);
        client.setSoTimeout(10000);
        //获得键盘输入
    }
}
