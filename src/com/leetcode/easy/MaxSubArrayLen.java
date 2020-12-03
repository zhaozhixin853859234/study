package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>study</h3>
 * 给定⼀个未排序的整数数组，找出最长连续序列的长度。
 * 比如输⼊: [100, 4, 200, 1, 3, 2]，那么得到的答案应该是4，因为最长的连续⼦序列是[1,2,3,4]。
 * @author : zhao
 * @version :
 * @date : 2020-05-29 09:25
 */
public class MaxSubArrayLen {
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(a));
    }

    private static int longestConsecutive(int[] nums){
        if (nums.length==0)
            return 0;

        Set<Integer> set = new HashSet<>();
        for (int i:nums) {
            set.add(i);
        }

        int longestSubArray = 1;
        // 用num暂存遍历集合的值，不去改变原集合元素
        int num;
        for (Integer e:set) {
            int maxLen = 1;
            num = e;
            while (set.contains(--num)){
                maxLen++;
                if (maxLen>longestSubArray)
                    longestSubArray = maxLen;
            }
        }
        return longestSubArray;
    }
}
