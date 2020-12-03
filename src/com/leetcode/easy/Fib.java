package com.leetcode.easy;

public class Fib {
    // 本题使用递归会导致时间超限,
    // 因为递归本省时间复杂度就高，加上要不断取模，java里取模耗时长，
    // 所以在此回归最简单的for循环和数组
    public static int fib(int n) {
        if (n==0)
            return 0;
        int[] a=new int[n+1];
        a[0]=0;
        a[1]=1;
        for (int i = 2; i <n +1; i++) {
            a[i]=(a[i-1]+a[i-2])%1000000007;
        }
        return a[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
