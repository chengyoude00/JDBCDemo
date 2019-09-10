/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: Democe
    Author:   cyd
    Date:     2019/7/31 12:20
    Description: 
     
 */
package demo08.Threadday;


public class Democe {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }

}

