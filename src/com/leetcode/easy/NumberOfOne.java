package com.leetcode.easy;

public class NumberOfOne {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String bs = Integer.toBinaryString(n);
        int num=0;
        int[] s = new int[bs.length()];
        for (int i = 0; i <s.length ; i++) {
            s[i] = bs.charAt(i);
        }
        for (int i = 0; i <s.length ; i++) {
            if (s[i]==1){
                num ++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int res;
        res = hammingWeight(9);
        System.out.println(res);
    }
}
