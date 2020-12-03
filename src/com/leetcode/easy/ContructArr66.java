package com.leetcode.easy;

// 暴力解法，o（n^2）
public class ContructArr66 {
    public static int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            int tmp =1;
            for (int j = 0; j <a.length ; j++) {
                if (j!=i)
                    tmp*=a[j];
            }
            res[i] = tmp;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] a = {0,2,3,4,5};
        int[] res = constructArr(a);
        for (int i:res) {
            System.out.println(i);
        }
    }
}
