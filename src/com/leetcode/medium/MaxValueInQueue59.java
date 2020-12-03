package com.leetcode.medium;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// 双端单调递减队列
public class MaxValueInQueue59 {
    Queue<Integer> q1;
    Deque<Integer> q2;// 底层由linkedList实现
    public MaxValueInQueue59() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public int max_value() {
        return q2.isEmpty()?-1:q2.peekFirst();
    }

    public void push_back(int value) {
        q1.add(value);
//        if (q2.isEmpty())
//            q2.addLast(value);
        while (!q2.isEmpty() && q2.getLast()<value){
            q2.removeLast();
        }
        q2.addLast(value);
    }

    public int pop_front() {
        if (q1.isEmpty())
            return -1;
        int res = q1.poll();
        if (res==q2.getFirst())
            q2.removeFirst();
        return res;
    }
}
