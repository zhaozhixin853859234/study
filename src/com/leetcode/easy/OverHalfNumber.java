package com.leetcode.easy;

import java.util.HashMap;

public class OverHalfNumber {
    public static  int majorityElement(int[] nums) {
        int arrayLength = nums.length/2;
        int res = 0;
        if (nums.length==1) return nums[0];
        else {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                int value = hashMap.get(num)+1;
                if (value>arrayLength)
                    res = num;
                hashMap.put(num, value);
            }
        }
        }
    return res;
    }


    public static void main(String[] args) {
        int[] s = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int res = majorityElement(s);
        System.out.println(res);
    }
}
