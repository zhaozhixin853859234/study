package com.leetcode.easy;

public class WaysToStep0801_1 {
    public static int waysToStep(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else if (n==2)
            return 2;
        else if (n==3)
            return 4;
        //int[] res = new int[n+1];
        int n_1 = 1;
        int n_2 = 2;
        int n_3 = 4;
        int res = 0;

        for (int i = 4; i <n+1 ; i++) {
            res =(n_1 + (n_2 + n_3)%1000000007)%1000000007;
            n_1 = n_2;
            n_2 = n_3;
            n_3 = res;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(waysToStep(5));
    }
}
