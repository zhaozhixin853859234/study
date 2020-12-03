package com.leetcode.easy;
// 暴力求解，每滑动一次比较窗口内元素，找到最大值
public class MaxSlideWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0||k==0)
            return new int[0];
        int max = Integer.MIN_VALUE;
        int[] res = new int[nums.length-k+1];
        for (int i = 0; i <nums.length-k+1 ; i++) {
            for (int j = i; j <i+k ; j++) {
                max = Math.max(max,nums[j]);
            }
            res[i] = max;
            max = Integer.MIN_VALUE;
        }
        return res;
    }
}
