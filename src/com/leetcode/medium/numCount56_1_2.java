package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-29 10:44
 */

// 按位分组
public class numCount56_1_2 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(7));
    }

    // 当只有一个数字出现一次时，直接异或可以得到结果，
    // 当两个数字出现一次时，考虑将数字分成两组，满足：
    // 1、相同的数字在同一个分组
    // 2、出现一次的两个数字在不同分组里
    // 现将数组元素全部异或，可以得到两个出现一次数字的异或结果，
    // 只有当两个数字二进制位不同时，异或结果为1，按异或结果的最低位1来分组，可以满足上面两个条件
    // 分组两个问题：
    // 1、如何找异或结果二进制最低位的1 -> lowbit = sum & (-sum)
    // 2、如何取其他数字二进制位上的数字比较 -> lowbit & num
    // 注意二进制按位与&得到的是二进制数，每一位上值都为1则结果为1，其他为0
    public int[] singleNumbers(int[] nums) {
        int[] res =new int[2];
        int sum =0;
        for (int num:nums) {
            sum^=num;
        }
        int lowbit = sum&(-sum);
        for (int num:nums) {
            if ((lowbit&num)==0)
                res[0]^=num;
            else res[1]^=num;
        }

        return res;

    }
}
