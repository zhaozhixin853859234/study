package com.leetcode.medium;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class FooBar {
    private int n;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private int count = 1;
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
            if (count!=1)
                condition.await();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            condition.signal();
            count=2;
            lock.unlock();
            }

    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
            if (count!=2)
                condition.await();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            condition.signal();
            count = 1;
            lock.unlock();
        }
    }

}
