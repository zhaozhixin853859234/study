package com.leetcode.medium;


// 利用位运算，二进制各个位上，出现一次数字k在二进制的对应位为0时，
// 该对应位为1在数组各个数字中出现的总次数应当为3n，
// 当k的对应位为1时，该对应位为1在数组各个数字中出现的总次数应当为3n + 1
public class SingleNumber56_1 {
//    public static int singleNumber(int[] nums) {
//
//    }
    public static void main(String[] args) {
        int res = 1;
        res<<=1;
        System.out.println(res);
        System.out.println(res>>>1);
    }
}
