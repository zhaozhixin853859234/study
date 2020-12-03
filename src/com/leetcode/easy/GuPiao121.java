package com.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-13 16:53
 */
public class GuPiao121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] input = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            input[i] = Integer.parseInt(s[i]);
        }
        System.out.println(maxProfit(input));

    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        if (length==0)
            return 0;
        int[] dp = new int[length];
        dp[0] = 0;
        int max = 0;
        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(0,dp[i-1]-(prices[i-1]-prices[i]));

            max= Math.max(dp[i],max);
        }
        System.out.println(Arrays.toString(dp));
        return max;

    }
}
