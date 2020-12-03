package com.leetcode.easy;

// 暴力解法
public class MaxProfit63 {
    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int len = prices.length;
        for (int i = 0; i <len-1 ; i++) {
            for (int j =i+1; j < len; j++) {
                maxProfit = Math.max(maxProfit,prices[j]-prices[i]);
            }
        }
        return Math.max(maxProfit, 0);
    }
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4,8,9};
        System.out.println(maxProfit(a));
    }

}
