///*
//    Copyright (C), 2015-2019, XXX有限公司
//    FileName: DemoLambdaCook
//    Author:   cyd
//    Date:     2019/7/31 15:25
//    Description:
//
// */
//package demo08.lambda.LambdaExecise;
//
//
//public class DemoLambdaCook {
//    public static void main(String[] args) {
//
//     invokeCook(()->System.out.println("吃饭啦"));
//        Cook cook = new CookImpl();
//        invokeCook(new Cook() {
//            @Override
//            public void makeFood() {
//                System.out.println("chi");
//            }
//        });
//    }
//    private  static void invokeCook(Cook cook){
//        cook.makeFood();
//    }
//
//}
//
