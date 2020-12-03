package com.java.concurrent.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorTest implements Runnable{
    private int id;
    public executorTest(int id){
        this.id = id;
    }
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("当前线程："+Thread.currentThread().getName()+" 当前executorTest对象："+id+" i = "+i);
            Thread.currentThread().yield();
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        for (int i = 0; i <10 ; i++) {
            es.execute(new executorTest(i));
        }

        System.out.println("提交任务结束");
        es.shutdown();
        System.out.println("结束");
    }
}
