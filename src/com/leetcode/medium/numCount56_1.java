package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-29 09:55
 */

// 时间复杂度O(n),需要用到额外辅助空间Set
public class numCount56_1 {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int index =0;
        Set<Integer> set = new HashSet<>();
        for(int i= 0;i<nums.length;i++){
            if(set.add(nums[i]))
                continue;
            else
                set.remove(nums[i]);
        }
        for(Integer num:set){
            res[index++]=num;
        }
        return res;
    }

}
