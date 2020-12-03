package com.java.concurrent.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable <Integer>{
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 1; i < 10; i++) {
            sum=sum+i;
            try{
            Thread.currentThread().sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new CallableTest());
        Thread t1 = new Thread(task,"t1");

        t1.start();

        System.out.println("主线程等待计算结果");
        System.out.println("1到10的和为："+task.get());
        System.out.println("计算完毕");
    }
}
