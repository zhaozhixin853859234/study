package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-02 14:19
 */
// 二分法，时间复杂度logN
public class NumPow16_2 {
    public static void main(String[] args) {
        System.out.println(myPow(2,-3));
    }
    public static double myPow(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res =1.0;
        if (b<0){
            x =1/x;
            b = -b;
        }

        while (b!=0){
            if (b%2==1)
                res*=x;
            x*=x;
            b>>=1;
        }
        return res;
    }
}

