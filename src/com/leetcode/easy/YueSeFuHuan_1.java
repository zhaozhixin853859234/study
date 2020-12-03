package com.leetcode.easy;

// 迭代,最后一轮剩下数字的索引为0，可以推出其在倒数第二轮中索引：
// 先在最后一个数字前面补上m个数字，模拟两个数字时删除另一数字，
// 需要对数组长度取模
public class YueSeFuHuan_1{
    public int lastRemaining(int n, int m) {
        if (n==1)
            return 0;
        int res = 0;
        for (int i = 2; i <n ; i++) {
            res = (res+m)%i;
        }
        return res;
    }
}
