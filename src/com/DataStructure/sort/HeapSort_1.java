package com.DataStructure.sort;

import java.util.Arrays;

public class HeapSort_1 {
    public static void main(String[] args) {
        int[] a = {6,4,2,3,9,7,12};
        int[] res = heapSort(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] heapSort(int[] a){
        // 从最后一个非叶子节点构建大根堆(最后一个叶子节点a.length-1的父节点（a.length-1-1）/2)
        for (int i = a.length/2-1; i >=0 ; i--) {
            adjustHeap(a,i,a.length);
        }

        for (int i = a.length-1; i >=1 ; i--) {
            swap(a,0,i);
            // 交换根节点和数组最后一个元素后，确定一个元素位置，再次调整根节点
            adjustHeap(a,0, i);
        }
        return a;
    }
    // 小顶堆用于降序，大顶推用于升序
    public static void adjustHeap(int[] a,int parentIndex, int len){
        int tmp = a[parentIndex];

        // 每次调整的数组长度会减1，每次调整会确定一个最大值
        for (int child = 2*parentIndex +1; child < len; child=child*2+1){
            // 每次选择最大（最小）的子节点
            if (child+1<len && a[child] < a[child+1])
                child++;
            if (a[child] > tmp){
                swap(a,child,parentIndex);
                parentIndex = child;
            }
            else break;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
