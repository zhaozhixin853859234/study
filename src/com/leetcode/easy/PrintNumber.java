package com.leetcode.easy;

/**
 * <h3>study</h3>
 * 问题：给你n个⽆无序的int整型数组arr，并且这些整数的取值范围都在0-20之间，要你在 O(n) 的时
 * 间复杂度中把这 n 个数按照从⼩小到⼤大的顺序打印出来
 * @author : zhao
 * @version :
 * @date : 2020-05-28 09:54
 */
public class PrintNumber {

    public static void print(int[] input){
        int len = input.length;
        int[] tmp = new int[21];

        for (int i = 0; i < len; i++) {
            // tmp数组第i个位置上存放数字i的个数
            tmp[input[i]]++;
        }

        for (int i = 0; i < 21; i++) {
            for (int j = 0; j <tmp[i] ; j++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {12,4,5,3,3,7,9,8,2,2,4};
        print(input);

    }
}
