package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-11 14:13
 */
public class Jump_55 {
    public static boolean canJump(int[] nums) {
        if (nums.length==0)
            return false;
        else if (nums.length==1)
            return true;
        else if(nums[0]==0)
            return false;
        else{
            for (int i = 1; i < nums.length; i++) {
                if (nums[i]==0){
                    boolean tmp = false;
                    for (int j = 0; j < i; j++) {
                        if (i==nums.length-1 && nums[j]>=i-j){
                            tmp = true;
                            break;
                        }
                        if(nums[j]>i-j){
                            tmp = true;
                            break;
                        }
                    }
                    if (!tmp)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] input = {3,2,2,0,0,4};
        System.out.println(canJump(input));
    }

}
