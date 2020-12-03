package com.leetcode.easy;

import java.util.HashSet;

public class RepeatNum {
    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(nums[0]);
        int repeat = 0;
        for (int j:nums) {
            if (!hs.add(nums[j])){
                repeat = nums[j];
                break;
            }

        }

        for (int i = 1; i <nums.length ; i++) {
            if (!hs.add(nums[i])){
                repeat = nums[i];
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {
    int[] a = {2, 3, 1, 0, 2, 5, 3};
    int w = findRepeatNumber(a);
    System.out.println(w);
    }
}
