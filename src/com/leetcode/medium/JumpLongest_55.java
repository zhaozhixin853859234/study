package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-11 14:49
 */
public class JumpLongest_55 {
    public static boolean canJump(int[] nums) {
        int rightLongest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i>rightLongest)
                return false;
            rightLongest = Math.max(rightLongest,nums[i]+i);

        }
        return true;
    }
}
