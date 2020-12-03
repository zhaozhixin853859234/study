package com.leetcode.easy;

public class NumTimes_1 {
    // 二分查找法
//    若查找 右边界 rightright ，则执行 i = m + 1 ；（跳出时 ii 指向右边界）
//    若查找 左边界 leftleft ，则执行 j = m - 1；（跳出时 jj 指向左边界）

    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        // 寻找右边界
        while (i<=j){
            int m = (i+j)/2;
            if (nums[m]<=target)
                i = m+1;
            else
                j = m-1;
        }
        int right = i;
        // 没有target时直接返回0
        if (j>=0&&nums[j]!=target)
            return 0;

        //寻找左边界
        i = 0;
        while (i<=j){
            int m = (i+j)/2;
            if (nums[m]<target)
                i = m+1;
            else
                j = m-1;
        }
        int left = j;
        return right-left-1;

    }
}
