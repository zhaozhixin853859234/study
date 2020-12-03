package com.leetcode.easy;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-14 15:40
 */

public class MaxMoney198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] input = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            input[i] = Integer.parseInt(str[i]);
        }

        System.out.println(rob(input));
    }
    // 可以直接在原数组上运算
    public static int rob(int[] nums) {
        int len = nums.length;
        if (len==0)
            return 0;
        else if (len==1)
            return nums[0];
        else if (len==2)
            return Math.max(nums[0], nums[1]);
        else {
            nums[1] = Math.max(nums[0], nums[1]);
            int max = nums[1];
            int max_before = nums[0];
            for (int i = 2; i < len; i++){
                max_before = Math.max(max_before,nums[i-2]);
                nums[i] = max_before +nums[i];
                max = Math.max(max,nums[i]);
            }

            return max;

        }
    }
}
