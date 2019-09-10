/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: TCPClient
    Author:   cyd
    Date:     2019/8/2 11:02
    Description: 
     
 */
package socketDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
//数据源："F:\Pictures\YouDeCheng.jpg"
//目的地：服务器
//TCP通信客户端
public class TCPClient {
    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("127.0.0.1", 8888);
//        OutputStream outputStream = socket.getOutputStream();//获得网络字节输出流
//        outputStream.write("你好服务器".getBytes());
//        socket.close();
        FileInputStream fs = new FileInputStream("F:\\Pictures\\YouDeCheng.jpg");//获取本地字节流FileInputStream对象
        Socket socket = new Socket("127.0.0.1",8888);//创建客户端Socket对象，构造方法绑定ip地址和端口
        OutputStream outputStream = socket.getOutputStream();
        //使用本地流FileInputStream对象中的方法read，读取本地文件
        int len= 0 ;
        byte[] bytes = new byte[1024];

        while ((len=fs.read(bytes)) != -1){
            outputStream.write(bytes,0,len);

        }

        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        System.out.println("444444444444444444444444444444");
        fs.close();
        socket.close();
    }

}

