/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoFile
    Author:   cyd
    Date:     2019/8/1 10:12
    Description: file ;directory;path
     
 */
package demo08.day81;

//绝对路径；相对路径

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {

        //File构造方法E:\Demo\src\demo08\day81\DemoFile.java
        show01();
    }

    private static void show01() throws IOException {
        File file = new File("E:\\Demo\\src\\demo08\\day");
        System.out.println(file);
        File file1 = new File("DemoFile.java");
        System.out.println(file1);
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
        String name = file.getName();
        System.out.println(name);
        String path = file.getPath();
        System.out.println(path);
        long length = file.length();
        System.out.println(length);
        System.out.println("判断文件是否存在"+file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println("===================================================");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        System.out.println("======================================");
        File file2 = new File("E:\\Demo");
        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);
        System.out.println("*******************************");
        boolean delete = file2.delete();
        System.out.println(delete);
        System.out.println("99999999999999999999999999999999999999999999999999999999999999999999999");
        File[] files = file2.listFiles();
        for (File f : files) {
            System.out.println(f);

            }
        System.out.println("11111111111111111111111111111111111111111111111111111111");
        String [] arr = file2.list();
        for (String FileName :arr){
            System.out.println( FileName);
        }
    }



}

