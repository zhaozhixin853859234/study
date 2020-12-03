package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
// 双指针法
// 滑动窗口,滑动窗口一般表示成一个左闭右开区间。在一开始，i=1, j=1
// 滑动窗口位于序列的最左侧，窗口大小为零
// 此方法时间超限
public class Add2Target {
    public static int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        for (int i = 1; i <target/2+1 ; i++) {
            for (int j = i+1; j < target/2+2; j++) {
                if (((i+j)*(j-i+1)/2)==target){
                    int[] tmp = new int[j-i+1];
                    for (int k = 0; k <tmp.length ; k++) {
                        tmp[k] = k+i;
                    }
                    res.add(tmp);
                }
            }
        }
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] res = findContinuousSequence(9);
        for (int[] i:res) {
            for (int j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
