/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: jsoupDemo_1
    Author:   cyd
    Date:     2019/9/2 14:45
    Description: 
     
 */
package jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class jsoupDemo_1 {
    public static void main(String[] args) throws IOException {
        //获取doucment对象根据xml文档获取
        //获取student.xml 的path
        String path=jsoupDemo_1.class.getClassLoader().getResource("student.xml").getPath();
        //解析xml文档，加载文档内存获取dom树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取元素对象ELement
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        //获取第一个name的element对象
        Element element = elements.get(0);
        //获取数据
        String name = element.text();
        System.out.println(name);
    }


}

