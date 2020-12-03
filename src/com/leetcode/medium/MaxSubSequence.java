package com.leetcode.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-09 15:58
 */
public class MaxSubSequence {
    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        int res = 0;
        for (int i = 0; i <len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] input = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            input[i] = Integer.parseInt(str[i]);
        }

        System.out.println(lengthOfLIS(input));

    }
}
