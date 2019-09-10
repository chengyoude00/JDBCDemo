/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: DemoThreadPool
    Author:   cyd
    Date:     2019/7/31 14:11
    Description: 
     
 */
package demo08.Threadday.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//线程池接口executorService
public class DemoThreadPool {
//Eexcutor
public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(2);
    es.submit(new RunnableImp());
    es.submit(new RunnableImp());
    es.submit(new RunnableImp());
    es.shutdown();
}
}

