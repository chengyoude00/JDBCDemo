/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: Salary
    Author:   cyd
    Date:     2019/8/11 20:50
    Description: 
     
 */


import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工总数：");
        int number = scanner.nextInt();
        System.out.println("请顺次输入员工的入职年限：");
        Integer[] years = new Integer[number];
        Integer[] salarys = new Integer[number];
        for(int i=0;i<number;i++){
            years[i] = scanner.nextInt();
            salarys[i] = 100;
        }
        for(int j=1;j<number;j++){
            if(years[j]>years[j-1]){
                salarys[j]=salarys[j-1]+100;
            }else if(years[j]<years[j-1]){
                salarys[j-1]=salarys[j]+100;
            }
        }
        int amount=0;
        for(int k=0;k<number;k++){
            amount+=salarys[k];
        }
        System.out.println("最少发的总奖金数为："+amount);
    }
}
