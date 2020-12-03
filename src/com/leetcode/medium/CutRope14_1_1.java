package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * @author : zhao
 * @version :
 * @date : 2020-05-29 21:42
 */
// 数学推导，只需要截成长度为3一段即可，当剩下最后一段长度为1时，加入前一段，
public class CutRope14_1_1 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(4));
    }

    private static int cuttingRope(int n) {
        if (n<=3)
            return n-1;
        int a = n/3;
        int thelastNum = n%3;
        if(thelastNum==0)
            return (int)Math.pow(3,a);
        if (thelastNum==1)
            return (int)Math.pow(3,(a-1))*4;
        return (int)Math.pow(3,a)*2;
    }
}
