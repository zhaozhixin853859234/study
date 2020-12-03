package com.leetcode.easy;

import java.util.Stack;

public class StackImplQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int size;
    public StackImplQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
        size = 0;
    }
    public void appendTail(int value) {
        if (s1.isEmpty()){
            s1.push(value);
        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(value);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

        size++;
    }

    public int deleteHead() {
        if(size==0)
            return -1;
        size--;
        return s1.pop();
    }


}
