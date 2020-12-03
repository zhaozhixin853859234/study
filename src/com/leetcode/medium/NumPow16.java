package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-02 14:00
 */
// 超时,n次相乘
public class NumPow16 {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
    public static double myPow(double x, int n) {
        if(n==0)
            return 1.0;
        double res = 1.0;
        if(n>0){
            for (int i = 0; i <n ; i++) {
                res*=x;
            }
        }

        if (n<0){
            for (int i = 0; i < n*(-1); i++) {
                res*=(1/x);
            }
        }
        return res;
    }
}
