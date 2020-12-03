package com.leetcode.easy;

// 可以优化空间复杂度，O（n）---》O（1）
public class WaysToStep0801 {
    public static int waysToStep(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else if (n==2)
            return 2;
        else if (n==3)
            return 4;
        int[] res = new int[n+1];
        res[1] = 1;
        res[2] = 2;
        res[3] = 4;
        for (int i = 4; i <n+1 ; i++) {
            res[i] = res[i-1]+res[i-2]+res[i-3];
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(waysToStep(5));
    }
}
