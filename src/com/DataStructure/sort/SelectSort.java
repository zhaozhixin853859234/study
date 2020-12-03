package com.DataStructure.sort;

// 从大到小顺序,时间复杂度是O(n^2)，空间复杂度是O(1)
public class SelectSort {
    public static int[] selectSort(int[] array){
        // 设定游标
        int cursor = 0;

        // 剩下最后一个元素必然是最大或者最小的，不需要排序
        while (cursor<array.length-1){
            int max = array[cursor];
            int maxIndex = cursor;

            // 找到游标右侧元素最大值
            for (int i = cursor; i < array.length; i++) {
                if (array[i]>max){
                    max = array[i];
                    maxIndex = i;
                }
            }

            // 将最大值与游标处元素交换，判断可能减少交换次数
            if (maxIndex!=cursor){
                int tmp = array[cursor];
                array[cursor] = array[maxIndex];
                array[maxIndex] = tmp;
            }
            cursor++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {-1,-2,3,6,4,9,5,1};
        int[] res = selectSort(a);
        for (int i:res) {
            System.out.print(i+" ");
        }
    }
}
