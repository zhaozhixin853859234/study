package com.leetcode.easy;

public class MinArray {
    public int minArray(int[] numbers) {
        int res = 0;
        if (numbers.length<2)
            return numbers[0];

        for (int i = 1; i <numbers.length ; i++) {
            if (numbers[i]<numbers[i-1]){
                res = numbers[i];
                break;
            }
            else res = numbers[0];
        }
        return res;
    }
}
