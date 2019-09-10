/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: TCPServer
    Author:   cyd
    Date:     2019/8/2 11:17
    Description: 
     
 */
package socketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

//tcp通信服务器端
/*数据源：客户端上传的文件
目的地:服务器的硬盘
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(8888);
//        Socket socket = serverSocket.accept();
//        InputStream is = socket.getInputStream();//获得网络字节输入流对象
//        byte[] bytes = new byte[1024];
//        int len = is.read(bytes);
//        System.out.println(new String(bytes,0,len));
//        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("收到谢谢".getBytes());
//        socket.close();
//        serverSocket.close();

        ServerSocket serverSocket = new ServerSocket(8888);
//        Socket socket = serverSocket.accept();
//        InputStream is = socket.getInputStream();
//        File file = new File("E:\\Demo\\socket");
//        if (!file.exists()){
//            file.mkdir();
//        }
//        String fileName = "iscast"+System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";
//        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);//存取的目的文件夹；创建本地字节流FileOutStream对象，构造方法绑定输出目的地
//        int len =0;
//        byte[] bytes = new byte[1024];
//        System.out.println("111111111111111111111111");
//        while ((len=is.read(bytes))!=-1){//read阻塞状态
//            fos.write(bytes,0,len);
//
//        }
//       // socket.shutdownInput();
//        System.out.println("3333333333333333333333333333");
//        socket.getOutputStream().write("上传成功".getBytes());
//        serverSocket.close();
//        socket.close();
//        fos.close();
while (true){
    Socket socket = serverSocket.accept();
    //使用多线程技术提高程序效率
    new Thread(new Runnable() {


        //完成文件上传
        @Override
        public void run() {
            try{InputStream is = socket.getInputStream();
                File file = new File("E:\\Demo\\socket");
                if (!file.exists()){
                    file.mkdir();
                }
                String fileName = "iscast"+System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";
                FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);//存取的目的文件夹；创建本地字节流FileOutStream对象，构造方法绑定输出目的地
                int len =0;
                byte[] bytes = new byte[1024];
                System.out.println("111111111111111111111111");
                while ((len=is.read(bytes))!=-1){//read阻塞状态
                    fos.write(bytes,0,len);

                }
                // socket.shutdownInput();
                System.out.println("上传成功");
                socket.getOutputStream().write("上传成功".getBytes());
//    serverSocket.close();//服务器不用关闭
                socket.close();
                fos.close();

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }).start();

}
    }
}

