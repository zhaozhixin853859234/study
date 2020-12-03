package com.leetcode.easy;

public class IsStraight {
    public static boolean isStraight(int[] nums) {
        int len  = 5;
        // 排序
        for (int i = 0; i <len-1 ; i++) {
            for (int j = i; j <len ; j++) {
                if (nums[i]>nums[j]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }


        int zeroNum = 0;
        for (int i = 0; i <len - 1; i++) {
            if (nums[i]==0)
                zeroNum = zeroNum + 1;
            else if (nums[i]==nums[i+1])
                return false;
            else
                zeroNum = zeroNum + nums[i]-nums[i+1]+1;
        }

        return zeroNum>=0;
    }

    public static void main(String[] args) {
        int[] a = {0,0,8,4,5};
        System.out.println(isStraight(a));
    }
}
