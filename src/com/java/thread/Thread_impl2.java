package com.java.thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Thread_impl2 extends Thread {
    public void run(){
        int  a = 0;
        for (a = 0; a < 10; a++) {
            System.out.println(currentThread().getName()+" : "+ a);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread_impl2 t1 = new Thread_impl2();
        Thread_impl2 t2 = new Thread_impl2();
        t1.start();
        t2.start();
        //t1.run();

        Map<Integer,Integer> map = Collections.synchronizedMap(new HashMap<>());
    }
}
