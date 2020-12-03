package com.DataStructure.sort;

// 二分插入排序
// 优化：cursor左边元素已经排序好，
// 在找cursor位置上元素的插入位置时，可以采用二分查找法
// 移动次数不变，比较次数减少
public class InsertSort_1 {
    public static int[] insertSort(int[] a){
        int cursor = 1;
        while (cursor<a.length){
            // 需要用一个辅助变量记录交换元素后，原来cursor位置元素的值，
            // 且原来cursor的值不能改变
            int i=0,j=cursor-1;
            // 二分查找cursor的插入位置
            // 最后插入位置为j+1或者i
            while (i<=j){
                int mid = (i+j)/2;
                if (a[mid]>a[cursor])
                    i = mid+1;
                else
                    j = mid-1;
            }

            // 将cursor位置元素插入到insertIndex位置，后面元素后移
            // 需要用一个辅助变量记录交换元素后，原来cursor位置元素的值，
            // 且原来cursor的值不能改变
            int cursor_change = cursor;
            for (int k = cursor-1; k >i-1 ; k--) {
               int tmp = a[cursor_change];
               a[cursor_change] =a[k];
               a[k] = tmp;
               cursor_change--;
            }
            cursor++;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {-1,-2,3,6,4,9,5,1};
        int[] res = insertSort(a);
        for (int i:res) {
            System.out.print(i+" ");
        }
    }

}
