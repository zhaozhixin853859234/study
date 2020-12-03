package com.leetcode.easy;

// 动态规划
public class Maxprofit63_2 {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len==0)
            return 0;
        int minPrice = prices[0];
        int res = 0;
        for (int i = 1; i <len ; i++) {
            minPrice = prices[i]-minPrice>0?minPrice:prices[i];
            res = Math.max(res,prices[i] - minPrice);
        }
        return res;

    }
}
