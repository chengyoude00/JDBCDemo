/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: Demowait
    Author:   cyd
    Date:     2019/7/31 10:28
    Description: 
     
 */
package demo08.Threadday;


public class Demowait {
//    public  static  Object obj = new Object();//等待唤醒案例（线程之间的通信）
    public static void main(String[] args) {
                 Object obj  = new Object();
                 new  Thread(){
                     @Override
                     public void run() {
                         while (true){
                         //保证等待唤醒只能有一个执行
                         synchronized (obj){
                             System.out.println("告之老板需要的种类数量");
                             try {
                                 obj.wait();
                             } catch (InterruptedException e) {
                                 e.printStackTrace();
                             }
                             System.out.println("唤醒了");
                         }
                     }}
                 }.start();
                 new Thread(){
                     @Override
                     public void run() {
                         while (true){
//                         super.run();
                         try {
                             Thread.sleep(5000);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                         synchronized (obj){
                             System.out.println("老板5s后做好，告知顾客");
                             System.out.println("----------------------------------------" +
                                     "");
                             obj.notify();
                         }
                     }}
                 }.start();

    }

}

