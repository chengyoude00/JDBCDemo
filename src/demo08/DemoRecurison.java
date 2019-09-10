/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoRecurison
    Author:   cyd
    Date:     2019/8/1 14:08
    Description: 
     
 */
package demo08;


public class DemoRecurison {
    public static void main(String[] args) {
        System.out.println(a(100));
        System.out.println("乘法阶乘"+mu(5));
    }
    public  static  int mu(int i){
        if (i==1)
            return 1;
        return i*mu(i-1);
    }
    public  static  int a(int i){
            if (i==1)
            { return 1;}
            return  i+a(i-1);



    }
}



