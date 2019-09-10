/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: demo02data
    Author:   cyd
    Date:     2019/7/24 15:16
    Description: 
     
 */
package demo08.data1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class demo02data {
    public static void main(String[] args) {
        dem01();
        demo2();
    }

   private  static  void dem01(){
        //data()空参数构造方法
       Date data = new Date(1563953175388L);
       System.out.println(data);
   }
private  static  void  demo2(){
        Date data =new Date(0L);
    System.out.println(data);

}
}

