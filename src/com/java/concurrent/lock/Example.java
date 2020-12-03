package com.java.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example implements Runnable {
    private int a =10;

    private final Lock exLock = new ReentrantLock();

    @Override
    public void run() {
        exLock.lock();

        try {
            a++;
            Thread.currentThread().sleep(100);
            a--;
            System.out.println(Thread.currentThread().getName()+" : a = "+a);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            exLock.unlock();
        }
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        for (int i = 0; i < 10; i++) {
            String t_name = "Thread_"+i;
            Thread t = new Thread(e1,t_name);
            t.start();
            System.out.println("thread state end："+Thread.currentThread().getState());

        }

    }
}
