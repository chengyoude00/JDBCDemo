/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoTicket
    Author:   cyd
    Date:     2019/7/31 9:17
    Description: 
     
 */
package demo08.Threadday;


public class DemoTicket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }

}

