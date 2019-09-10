/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: RunnableImpl
    Author:   cyd
    Date:     2019/7/31 14:55
    Description: 
     
 */
package demo08.lambda;


public class RunnableImpl implements  Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

