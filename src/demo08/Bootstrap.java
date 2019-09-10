/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: Bootstrap
    Author:   cyd
    Date:     2019/7/24 9:02
    Description: 场景说明：红包发出去所有人都有红包，最后一个红包给群主自己

    普通红包（平均）：totalMoney totalCount余数放在最后一个红包里
    手气红包（随机）：最少1分钱 最多不超过平均数的2倍
     
 */
package demo08;


public class Bootstrap {
    @Override
    public String toString() {
        return "Bootstrap{}";
    }

    public static void main(String[] args) {
       OpenMode nomal =new normal();
    }

}

