package com.leetcode.easy;

import java.util.Deque;
import java.util.LinkedList;

// 单调队列求解，用非严格单调递减队列求每次滑动窗口最大值
// 当第j个元素进入队列时，
public class MaxSlideWindow_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0||k==0)
            return new int[0];
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<>();
        // 形成窗口,维护单调双端队列
        // 新加入的元素小于队尾元素则直接加入队尾，
        // 新加入的元素大于队尾元素，则将队列中大于该元素的值全部出队，
        for (int i = 0; i <k ; i++) {
            while (!deque.isEmpty()&&deque.peekLast()<nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        // 计算窗口最大值
        for (int i = k; i <nums.length; i++) {
            if(deque.peekFirst() == nums[i - k])
                deque.removeFirst();
            while (!deque.isEmpty() &&deque.peekLast()<nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }
}
