/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: TCPServer
    Author:   cyd
    Date:     2019/8/2 17:35
    Description: 
     
 */
package socketDemo.bs;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
//        Socket socket = server.accept();
//        InputStream is = socket.getInputStream();
////        byte[] bytes = new byte[1024];
////        int len = 0;
////        while ((len= is.read(bytes))!=-1){
////            System.out.println(new String(bytes,0,len));
////        }//获取一堆信息
//        //获取需要的数据信息
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));
//        String line = br.readLine();
//        //将数据切割
//        String[] arr = line.split(" ");
//        //截取/
//        String Htmlpath = arr[1].substring(1);
//        FileInputStream fis = new FileInputStream(Htmlpath);
//        OutputStream os = socket.getOutputStream();
//        os.write("HTTP/1.1 200 OK\r\n".getBytes());
//        os.write("Content-Type:text/html\r\n".getBytes());
//        os.write("\r\n".getBytes());
//        int len =0;
//        byte[] bytes = new byte[1024];
//        while ((len=fis.read(bytes))!=-1){
//            os.write(bytes,0,len);
//        }
//        fis.close();
//        socket.close();
        while (true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Socket socket = server.accept();
                        InputStream is = socket.getInputStream();
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len= is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }//获取一堆信息
                        //获取需要的数据信息
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
                        //将数据切割
                        String[] arr = line.split(" ");
                        //截取/
                        String Htmlpath = arr[1].substring(1);
                        FileInputStream fis = new FileInputStream(Htmlpath);
                        OutputStream os = socket.getOutputStream();
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());
                        int len =0;
                        byte[] bytes = new byte[1024];
                        while ((len=fis.read(bytes))!=-1){
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }).start();

        }
//        server.close();

    }
}

