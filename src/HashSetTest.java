/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: HashSetTest
    Author:   cyd
    Date:     2019/8/29 14:27
    Description: 
     
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        System.out.println("hashSet初始容量大小：+hashSet.size()");
        hashSet.add("my");
        hashSet.add("name");
        hashSet.add("is");
        hashSet.add("is");
        hashSet.add("jiaboyan");
        hashSet.add(",");
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("!");
        System.out.println("HashSet容量大小:"+hashSet.size());
        Iterator<String > iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
/*
ew
* */
        }
        hashSet.remove("jiabayan");
        System.out.println("hashSet 元素大小："+hashSet.size());
        hashSet.clear();
        System.out.println("hashSet元素大小："+hashSet.size());

        boolean isEmpty = hashSet.isEmpty();
        System.out.println("hashSet 是否为空："+isEmpty);
        boolean isContains = hashSet.contains("hello");
        System.out.println("hashSet 是否为空："+isContains);

    //    hashCodeAndEqual();
    }




    }



