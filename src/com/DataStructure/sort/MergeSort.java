package com.DataStructure.sort;

import java.util.Arrays;

public class MergeSort {
    private static int mergeCount = 0;
    private static int sortCount = 0;
    public static void main(String[] args) {
        int[] a = {8,6,4,5,2};
        // 左闭右开
        mergeSort(a,0,a.length);
        System.out.println(Arrays.toString(a));
        System.out.println("mergeCount:"+mergeCount);
        System.out.println("sortCount:"+sortCount);
    }
    public  static void mergeSort(int[] a,int start,int end){
        if (end-start<=1)
            return ;
        sortCount++;
        int mid = (end+start)/2;
        mergeSort(a,start,mid);
        System.out.println("1"+Arrays.toString(a));
        mergeSort(a,mid,end);
        System.out.println("2"+Arrays.toString(a));
        merge(a,start,end);
        System.out.println("3"+Arrays.toString(a));
    }

    public static void merge(int[] input,int start,int end){
        mergeCount++;
        int mid = (end+start)/2;
        //已经有序就返回
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        // mid两边两个数组的起始位置i，j
        int i = start;
        int j = mid;
        int tmpIndex = 0;
        int[] tmp = new int[end - start];


        while(i<mid && j<end){
            tmp[tmpIndex++] = input[i]>input[j] ? input[j++]:input[i++];
        }

        while (i<mid){
            tmp[tmpIndex++] = input[i++];
        }

        while (j<end){
            tmp[tmpIndex++] = input[j++];
        }
        //拷贝回结果，注意是copy回input从start开始的数据
        //System.arraycopy(tmp, 0, input, start, tmp.length);
        int t = 0;
        while (t < tmp.length){
            input[start++] = tmp[t++];
        }

    }

    // 归并排序可以并发执行
    public static void parallelMergeSort(int[] input,int start,int end,int numOfThreads) throws InterruptedException {
        if (numOfThreads<=1){
            mergeSort(input,start,end);
            return;
        }
        int mid = (start+end)/2;

        Thread leftSortor = mergeSortThread(input,start,mid,numOfThreads);
        Thread rightSortor = mergeSortThread(input,mid,end,numOfThreads);

        leftSortor.start();
        rightSortor.start();

        try{
            leftSortor.join();
            rightSortor.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        merge(input,start,end);
    }

    private static Thread mergeSortThread(int[] input, int low, int high, int numOfThreads) {
        return new Thread(() -> {
            try {
                parallelMergeSort(input, low, high, numOfThreads / 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

}
