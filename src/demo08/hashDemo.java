/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: hashDemo
    Author:   cyd
    Date:     2019/7/27 14:09
    Description: 
     
 */
package demo08;


import java.util.HashMap;
import java.util.Scanner;

public class hashDemo {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        System.out.println("请录入一个字符串");
        Scanner  scanner = new Scanner(System.in);
        String  st = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c :st.toCharArray()){
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }

        for (Character key :map.keySet()){
            Integer value = map.get(key);
            System.out.println(key +"="+value);
        }
        System.out.println(map);
    }

}

