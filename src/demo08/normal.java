/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: normal
    Author:   cyd
    Date:     2019/7/24 9:42
    Description: 
     
 */
package demo08;


import java.util.ArrayList;

public class normal implements OpenMode  {
    public normal() {
    }

    @Override
    public ArrayList<Integer> divide( final int totalMoney,final int totalCount) {
        ArrayList<Integer> List =new ArrayList<>();
        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            List.add(avg);
        }
        List.add(avg+mod);
        return List;
        //
//        if (obj instanceof  Person){}
//        person p = (person)obj;[obj是父类person是子类](向下转型)
    }
}

