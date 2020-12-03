package com.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class Thread_impl implements Runnable {
    private int a = 0;

    private String name;
    public Thread_impl(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int a = 0; a < 10; a++) {
            System.out.println(Thread.currentThread().getName()+" : " +a);
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread_impl t1 = new Thread_impl("t1");
        Thread_impl t2 =new Thread_impl("t2");
        Thread_impl3 t3 = new Thread_impl3();
//
//
//        Thread tt1 = new Thread(t1);
//        Thread tt2 = new Thread(t2);
//        Thread tt3 = new Thread(t3);
//        tt3.setName("t3");
//        // yield 方法将当前线程方法到可运行池变为Runnable状态，
//        // 使另一个优先级相等或者大于该线程的线程执行
//        // tt3.setPriority(MIN_PRIORITY);
//
//        tt1.start();
//        tt2.start();
//        tt3.start();
//        tt3.join();

        Thread tt1 = new Thread(t1,"tt1");
        tt1.start();

        Thread main = Thread.currentThread();
        Thread t = new Thread(main);
        t.start();
    }
}
class Thread_impl3 implements Runnable{
    @Override
    public void run() {
        for (int i = 20; i <30 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
