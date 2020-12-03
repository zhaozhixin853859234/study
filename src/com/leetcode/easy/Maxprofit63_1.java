package com.leetcode.easy;

// 双指针法
public class Maxprofit63_1 {
    public static int maxProfit(int[] prices) {
        int i= 1;
        int j = prices.length-2;
        int max = prices[prices.length-1];
        int min = prices[0];
        while (i<j){
            if (prices[i]<=min)
                min = prices[i++];

            if (prices[j]>=max)
                max = prices[j--];
        }
        return Math.max(max-min,0);

    }


    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4,8,9};
        System.out.println(maxProfit(a));
    }
}
