package com.leetcode.easy;


public class MAxSubArray_1 {
    public int maxSubArray(int[] nums) {
        if (nums.length==1)
            return nums[0];
        int dp = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp = dp>=0?dp+nums[i]:nums[i];
            res = Math.max(res,dp);
        }
        return res;
    }


    public interface  aa{
        void ss(); // 默认public abstract
        static void a(){
            System.out.println("  sd");
        }
        void aaa();
    }
}
