/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: ChiHuo
    Author:   cyd
    Date:     2019/7/31 12:13
    Description: 
     
 */
package demo08.Threadday;


public class ChiHuo extends Thread {
    private  BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把"+bz.pi+bz.xian+"的包子，包子铺开始生产包子");
                System.out.println("---------------------------------------------------");
            }
        }
    }
}

