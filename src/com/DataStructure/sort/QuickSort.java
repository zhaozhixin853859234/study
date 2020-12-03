package com.DataStructure.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {2,4,1,4,521,234,23};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] input,int left,int right){

        if (left<right){
            int pivot = partition(input,left,right);
            // 左闭右闭
            quickSort(input,left,pivot-1);
            quickSort(input,pivot+1,right);
        }
    }

    public static int partition(int[] input,int left,int right){
        // 选择一个基准数据，这里了每次选择待排序子数组的第一个元素，
        // 方法返回该基准数据的索引位置，即该基准数据在有序数组中的位置
        int tmp = input[left];
        // 不断重复两个while语句,知道low>=high时(其实是low=high)
        // low或high的位置就是该基准数据在数组中的正确索引位置.
        // 即将所有大于基准数据的元素放在其右边，小于基准数据的元素放在其左边
        // 由此确定该基准元素在最后有序数组的位置
        // left < right时，说明基准数据还没有与剩下数据比较一遍，需要继续比较，
        // 当 left = right 时，说明基准数据已经与剩下数据比较一遍，可以确定基准数据位置
        while(left<right){
            // 两个while的顺序不能调换
            // 从右向左，找到第一个小于基准数据tmp的元素
            while (left<right && input[right]>=tmp)
                right--;
            //if (left<right)
            input[left] =input[right];

            // 从左向右，找到第一个大于基准数据tmp的元素
            while (left<right && input[left]<=tmp)
                left++;
            //if (left<right)
            input[right] = input[left];
        }

        // 跳出循环时，left = right，为基准数据的位置
        input[left] = tmp;
//        System.out.println(left==right);
        return left;
    }
}
