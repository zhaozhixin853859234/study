package com.leetcode.easy;

public class NumTimes {
    public int search(int[] nums, int target) {
        int res =0;
        for (int i: nums) {
            if (i==target)
                res = res+1;
        }
        return res;
    }

}
