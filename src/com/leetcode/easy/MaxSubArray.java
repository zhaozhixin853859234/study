package com.leetcode.easy;
// 动态规划
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]>0)
                nums[i] = nums[i]+nums[i-1];
            res= Math.max(res,nums[i]);
        }
        return res;
    }
}
