package com.leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-04 10:45
 */
public class ThreeNum15_1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums==null||nums.length<3)
            return new LinkedList<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i <nums.length ; i++) {
            int left = i+1;
            int right = nums.length-1;
            if (nums[i]>0)
                return res;
            if (i > 0 && nums[i]==nums[i-1])
                continue;
            while (left<right){
                if (nums[i]+nums[left]+nums[right]==0){
                    List<Integer> tmp = new LinkedList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    res.add(tmp);
                    while (left<right&&nums[left]==nums[left+1]) ++left;
                    while (left<right&&nums[right]==nums[right-1]) --right;
                    ++left;
                    --right;
                }
                else if(nums[i]+nums[left]+nums[right]>0)
                    right--;
              else
                    left++;
            }
        }
        return res;

    }
}
