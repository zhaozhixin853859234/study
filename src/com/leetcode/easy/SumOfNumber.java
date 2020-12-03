package com.leetcode.easy;

// 动态规划
public class SumOfNumber {
    public static double[] twoSum(int n) {
        int[][] dp = new int[n+1][6*n+1];
        // 初始化条件
        for (int i = 1; i <=6 ; i++) {
            dp[1][i] = 1;
        }
        // 计算动态规划数组
        for (int i = 2; i <=n ; i++) {
            // 掷i个骰子，总数之和j至少为i
            for (int j = i; j <6*n+1 ; j++) {
                // 第n次点数加上第n-1次点数为第n次点数之和，
                // n次总点数j确定后，第n-1次点数和确定，第n次点数也确定
                for (int k = 1; k<=6 ; k++) {
                    if (j-k>0)
                        dp[i][j] = dp[i][j]+dp[i-1][j-k];
                    else break;
                }
            }
        }
        // 先计算出所有可能点数，不要在循环里重复计算
        double total = Math.pow(6,n);
        double[] res = new double[5*n+1];
        for (int i = 0; i <res.length ; i++) {
            res[i] = dp[n][n+i]/total;
        }
        return res;
    }

    public static void main(String[] args) {
        double[] res = twoSum(2);
        for (double i:res) {
            System.out.println(i);

        }
    }
}
