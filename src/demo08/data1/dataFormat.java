/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: dataFormat
    Author:   cyd
    Date:     2019/7/24 15:49
    Description: 
     
 */
package demo08.data1;

import java.lang.reflect.Field;
import java.text.ParseException;
import  java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dataFormat {
    public static void main(String[] args) throws  ParseException{

        String s= "yyyy-m-d";
        System.out.println(s.hashCode());
        s = "2o9o";
        System.out.println(s.hashCode());
        Date data = new Date(000L);
        SimpleDateFormat sy=new  SimpleDateFormat("yyyy年MM月dd日 HH: mm:ss");
        String format = sy.format(data);
        System.out.println(format);

        //String fo= sy.parse("2015");
        data01();
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
    private  static  void data01() throws ParseException{
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy年MM月dd日 HH: MM:ss");
        Date data =sdf.parse("1970年01月01日 08: 00:00");
        System.out.println(data);

    }
}

