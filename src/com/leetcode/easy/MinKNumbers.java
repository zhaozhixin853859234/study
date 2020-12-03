package com.leetcode.easy;
// 可以用堆数据结构来解决
public class MinKNumbers {
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        int temp;
        for (int i = 0; i <k; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            res[i] = arr[arr.length-i-1];
        }
        for (int i:arr) {
            System.out.print(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {0,0,1,2,4,2,2,3,1,4};
        int k = 8;
        int[] res = getLeastNumbers(a,k);
        for (int i:res) {
            System.out.println(i);
        }
    }
}
