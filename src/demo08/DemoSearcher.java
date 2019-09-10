/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoSeacher
    Author:   cyd
    Date:     2019/8/1 17:13
    Description: 
     
 */
package demo08;


import java.io.File;

public class DemoSearcher {
    public static void main(String[] args) {


        Searcher1(new File("E:\\Demo\\src\\demo08\\Threadday\\ThreadPool"));
    }
    public static  void Searcher1(File dir){
        //System.out.println(dir);
        //System.out.println("*************************************************");
        File [] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                    Searcher1(f);
            }else {
//                String s = f.toString();
                String name = f.getName();
                String path = f.getPath();
                String s = f.toString();//默认getpath方法
                String s1 = s.toLowerCase();
                boolean b = s1.endsWith(".java");if (b)
//                boolean  ss= s.endsWith(".java");
//                if (ss==true){
                {
                System.out.println(f);}
//            }
            }

            }
        }

    }


