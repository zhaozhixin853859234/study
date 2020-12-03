package com.leetcode.easy;
// 对撞双指针
public class TwoNum {
    public int[] twoSum(int[] nums, int target) {

        // 对撞双指针
        int i = 0;
        int j = nums.length-1;
        while (i<j){
            // 减少加法计算次数
            int s= nums[i]+nums[j];
            if (s>target)
                j = j-1;
            else if(s<target)
                i = i+1;
            else
                return  new int[]{nums[i],nums[j]};
        }
        return new int[0];



        // 时间复杂度过高
//        for (int i = 0; i <nums.length-1 ; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]+nums[j]==target){
//                    res[0] = nums[i];
//                    res[1] = nums[j];
//                }
//                if (nums[i]+nums[j]>target)
//                    break;
//            }
//        }



    }
}
