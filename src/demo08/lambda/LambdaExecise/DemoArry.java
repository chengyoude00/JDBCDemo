/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoArry
    Author:   cyd
    Date:     2019/7/31 15:46
    Description: 
     
 */
package demo08.lambda.LambdaExecise;


import java.util.Arrays;
import java.util.Comparator;

public class DemoArry {
    public static void main(String[] args) {
        Person [] arr = {
                new Person("陈",22),new Person("陈赫",44),new Person("LIU",22)
        };
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (Person p : arr) {
            System.out.println(p);
        }
        Arrays.sort(arr,(Person o1 ,Person o2)->{return  o1.getAge()-o2.getAge();});
    }
}

