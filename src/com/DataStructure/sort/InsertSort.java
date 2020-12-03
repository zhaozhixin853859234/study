package com.DataStructure.sort;

// 直接插入排序
// 由大到小
// 插⼊排序的时间复杂度是O(n^2)，空间复杂度是O(1)。
public class InsertSort {
    public static int[] insertSort(int[] a){
        int cursor = 1;
        while (cursor<a.length){
            // 需要用一个辅助变量记录交换元素后，原来cursor位置元素的值，
            // 且原来cursor的值不能改变
            int cursor_change = cursor;
            for (int i = cursor-1; i >=0 ; i--) {
                // 遇到小于a[cursor_change]的元素，则交换
                if (a[cursor_change]>a[i]){
                    int tmp = a[i];
                    a[i] = a[cursor_change];
                    a[cursor_change] = tmp;
                    cursor_change--;
                }
                else
                    break;
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
