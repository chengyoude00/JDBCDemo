/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoRunnable
    Author:   cyd
    Date:     2019/7/31 14:54
    Description: 
     
 */
package demo08.lambda;


public class DemoRunnable {
    public static void main(String[] args) {
//        Runnable run = new RunnableImpl();
//        Thread t = new Thread(run);
//        t.start();
//        new Thread(new RunnableImpl()).start();
//        new  Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println( Thread.currentThread().getName()+"实现老的进程");
//            }
//        }).start();

        new     Thread(() -> System.out.println(Thread.currentThread().getName()+"实现新进程")).start();//lambda写法（）代表参数run（），->代表将run方法参数传入到{}中


    }
}

