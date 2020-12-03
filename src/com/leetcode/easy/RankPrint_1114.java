package com.leetcode.easy;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class RankPrint_1114 {
    public RankPrint_1114() {

    }

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private int count=1;

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        lock.lock();
        printFirst.run();
        count=2;
        condition.signalAll();
        lock.unlock();

    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        // printSecond.run() outputs "second". Do not change or remove this line.
        if (count!=2)
            condition.await();
        printSecond.run();
        count=3;
        condition.signal();
        lock.unlock();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        lock.lock();
        while (count!=3){
            condition.await();
        }
        printThird.run();

        condition.signal();
        lock.unlock();
    }

}
