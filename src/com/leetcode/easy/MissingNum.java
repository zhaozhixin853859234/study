package com.leetcode.easy;

// 排序数组内的查找问题考虑使用二分查找法降低时间复杂度，N->logN
public class MissingNum {
    public static int missingNumber(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while (i<=j){
            int m = (i+j)/2;
            if (nums[m]==m)
                i = m+1;
            else
                j = m-1;
        }
        if (j>=0)
            return nums[j]+1;
        else
            return nums[0]-1;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,6};
        int[] b = {0,1,3};
        int[] c = {0};
        int[] d = {1};
        System.out.println(missingNumber(a));
        System.out.println(missingNumber(b));
        System.out.println(missingNumber(c));
        System.out.println(missingNumber(d));
    }
}
