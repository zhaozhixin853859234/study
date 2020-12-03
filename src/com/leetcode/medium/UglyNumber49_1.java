package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-10 11:08
 */
public class UglyNumber49_1 {

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
    public static int nthUglyNumber(int n) {
        int u_2 = 0;
        int u_3 = 0;
        int u_5 = 0;
        int[] dp = new int[n];
        // 初始化
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(dp[u_2]*2,dp[u_3]*3),dp[u_5]*5);

            if (dp[i]==dp[u_2]*2)
                u_2++;
            if (dp[i]==dp[u_3]*3)
                u_3++;
            if (dp[i]==dp[u_5]*5)
                u_5++;
        }

        return dp[n-1];

    }
}
