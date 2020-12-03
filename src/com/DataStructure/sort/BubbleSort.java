package com.DataStructure.sort;

public class BubbleSort {
    public static int[] bubbleSort(int[] a){
        for (int i = 0; i <a.length-1 ; i++) {
            boolean flag = true;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]>a[i]){
                    flag = false;
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            // 一趟下来是否发生元素交换，可以提前终止循环
            if (flag)
                break;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {-1,-2,3,6,4,9,5,1};
        int[] res = bubbleSort(a);
        for (int i:res) {
            System.out.print(i+" ");
        }
    }
}
