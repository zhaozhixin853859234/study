package com.leetcode.easy;

public class SequenceArray {
    public int[] exchange(int[] nums) {
        int end = nums.length-1;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp;

            while (nums[i] % 2 == 0) {
                if (end<i) break;
                    temp = nums[end];
                    nums[end] = nums[i];
                    nums[i] =temp;
                    end = end - 1;
                }
            }
        return nums;
        }
    }
