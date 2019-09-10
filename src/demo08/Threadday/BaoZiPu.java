/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: BaoZiPu
    Author:   cyd
    Date:     2019/7/31 11:54
    Description: 
     
 */
package demo08.Threadday;


public class BaoZiPu extends  Thread{
    private  BaoZi bz;
    public BaoZiPu(BaoZi bz){
        this.bz =bz;
    }

    @Override
    public void run() {
        while (true){
        int count =0;
        synchronized (bz){
            if (bz.flag ==true){
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (count%2==0){
                bz.pi = "薄皮";
                bz.xian = "三鲜";
            }else {
                bz.pi = "冰皮";
                bz.xian = " 牛肉";
            }
            count++;
            System.out.println("包子铺正在生产"+bz.pi+bz.xian+"包子");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bz.flag = true;
            bz.notify();
            System.out.println("包子铺已经生产好了"+bz.pi+bz.xian+"包子可以开吃了");
        }
    }}
}

