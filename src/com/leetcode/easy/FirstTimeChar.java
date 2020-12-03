package com.leetcode.easy;

import java.util.Arrays;

// 时间超限
public class FirstTimeChar {
    public static  char firstUniqChar(String s) {
        char res = ' ';
        if (s==null) return res;
        else {
            char[] chars = s.toCharArray();
            int[] nums = new int[chars.length];
            Arrays.fill(nums, 1);
            for (int i = 0; i < chars.length-1 ; i++) {
                for (int j = i+1; j < chars.length; j++) {
                    if (chars[i]==chars[j]){
                        nums[j] = nums[j]+1;
                        nums[i] = nums[i]+1;
                    }
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==1){
                    res = chars[i];
                    break;
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {
        String s= "leetcode";
        char res = firstUniqChar(s);
        System.out.println();
        System.out.println(res);
    }
}
