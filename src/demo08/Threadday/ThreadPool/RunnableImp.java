/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: RunnableImp
    Author:   cyd
    Date:     2019/7/31 14:41
    Description: 
     
 */
package demo08.Threadday.ThreadPool;


public class RunnableImp implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建一个新的线程");
    }
}

