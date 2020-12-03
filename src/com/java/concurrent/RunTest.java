package com.java.concurrent;

public class RunTest implements Runnable {
    @Override
    public void run() {
        System.out.println("running");
    }
    public void go(){
        start(1);
    }
    public void start(int i){

    }
    public static void main(String[] args) {
        RunTest rt = new RunTest();
        Thread t = new Thread(rt);

        System.out.println("running");
        t.start();
        //rt.go();
        //rt.start(1);
    }
}
