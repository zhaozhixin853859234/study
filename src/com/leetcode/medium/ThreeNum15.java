package com.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * <h3>study</h3>
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组

 * @author : zhao
 * @version :
 * @date : 2020-06-04 09:43
 */
public class ThreeNum15 {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(a);
        for (List<Integer> list:res ) {
            for (int num:list) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length==0)
            return new LinkedList<>();

        List<List<Integer>> res = new LinkedList<>();

        int rows = nums.length;
        int[] tmp = new int[(rows-1)*rows/2];
        int index = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                tmp[index++] = nums[i] + nums[j];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < tmp.length; j++) {
                List<Integer> listTmp = new LinkedList<>();
                if ((nums[i]+tmp[j])==0){
                    int cc = rows-1;
                    int cc_tmp = cc;
                    int count = 0;
                    while (j-cc>=0){
                        count++;
                        cc_tmp--;
                        cc = cc + cc_tmp;
                    }
                    if (count!=i){
                    listTmp.add(nums[i]);
                    listTmp.add(nums[count]);
                    int firstIndex = (rows-1)*rows/2-(rows-1-count)*(rows-count)/2;
                    listTmp.add(nums[count+(j - firstIndex) + 1]);
                    res.add(listTmp);
                    }
                }
            }
        }

    return res;

    }

}
