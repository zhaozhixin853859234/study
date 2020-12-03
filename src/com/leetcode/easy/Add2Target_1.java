package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

// 滑动窗口法
public class Add2Target_1 {
    public static int[][] findContinuousSequence(int target) {
        // 左边界i、右边界j
        int i = 1;
        int j = 1;
        // i到j范围内数字之和sum
        int sum = 0;
        // 返回结果
        List<int[]> list = new ArrayList<>();

        while (i<target/2){
            // 注意，滑动窗口的两个边界都只能向右移
            // 当sum值小于target时，将右边界右移，扩大sum值
            if (sum<target){
                sum+=j;
                j++;
            }
            // 当sum值大于target时，将左边界右移，减小sum值
            else if (sum>target){
                sum-=i;
                i++;
            }
            // 当sum值等于target时，记录下结果
            // 并将左边界右移，考察后面元素是否满足条件
            else {
                int[] tmp = new int[j-i+1];
                for (int k = 0; k < j-i+1; k++) {
                    tmp[k] = k+i;
                }
                list.add(tmp);
                sum-=i;
                i++;

            }
        }
        return list.toArray(new int[0][]);

    }
}
