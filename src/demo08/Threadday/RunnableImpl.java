/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: RunnableImpl
    Author:   cyd
    Date:     2019/7/31 9:09
    Description: 
     
 */
package demo08.Threadday;


import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable{

    private  int ticket =100;
//    Object obj =new Object();
    Lock l= new ReentrantLock();
    public void run() {
        while (true){
            l.lock();
//            synchronized (obj){
//                if (ticket>0){
//                    try {
//                        Thread.sleep(10);
//                    }catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"正在读第"+ticket+"张票");
//                    ticket--;
//                }
            if (ticket>0){
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+"正在读第"+ticket+"张票");
                ticket--;
            }catch (InterruptedException e){
                e.printStackTrace();

            }finally {//无论程序是否正常都会释放锁
                l.unlock();
            }




        }}}}

//               playTicket();

//            public synchronized  void playTicket(){
//            if (ticket>0){
//            try {
//                Thread.sleep(10);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"正在读第"+ticket+"张票");
//            ticket--;


//            l.unlock();






