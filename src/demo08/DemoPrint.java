/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoPrint
    Author:   cyd
    Date:     2019/8/1 15:09
    Description: 
     
 */
package demo08;


import java.io.File;

public class DemoPrint {
    public static void main(String[] args) {
        File file = new File("E:\\BaiduYunDownload\\基础班");
        getAllFile(file);
    }
    /**
     *
     */
    public  static  void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
           if (f.isDirectory()){
               //是文件夹则遍历文件夹
               getAllFile(f);
           }else
            System.out.println(f);

        }
    }

}

