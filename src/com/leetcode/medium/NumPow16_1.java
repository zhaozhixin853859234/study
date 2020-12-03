package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-02 14:06
 */
public class NumPow16_1 {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
    // 超时,n/2+1次相乘
    public static double myPow(double x, int n) {
        if (n==0)
            return 1;
        double res = 1.0;
        if (n>0){
            for (int i = 0; i <n/2; i++) {
                res *= x;
            }
            return n%2==0 ? res*res : res*res*x;
        }
        else {
            for (int j = 0; j < (n*(-1))/2 ; j++) {
                res*=(1/x);
            }
            return n%2==0? res*res: res*res*(1/x);
        }

}
}
