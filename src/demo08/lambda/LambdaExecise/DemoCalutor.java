/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoCalutor
    Author:   cyd
    Date:     2019/7/31 16:25
    Description: 
     
 */
package demo08.lambda.LambdaExecise;


public class DemoCalutor {
    public static void main(String[] args) {
        invokeCalc(120,130,(a,b)-> a+b);
        invokeCalc(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        Food(20,a->a*a);
    }
    private static  void  invokeCalc(int a,int b ,Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是"+result);
    }
    private  static   void Food(int a,Cook cook){
        int s = cook.makeFood(a);
        System.out.println("一个参数的"+s);
    }
}

