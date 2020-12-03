package com.leetcode.easy;
// 短路效应终止递归:短路与&&、短路或||
public class SumNum64 {
    public int sumNums(int n) {
        boolean x = n>1 && (n+=sumNums(n-1))>0;

        return n;
    }

}
