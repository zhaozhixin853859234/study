package com.DataStructure.sort;

public class HeapSort {
    public static void main(String[] args) {
        int[] a = {4,6,8,5,9};
        int[] res = heapSort(a);
        for (int i:res) {
            System.out.print(i+" ");
        }
    }
    public static int[] heapSort(int[] a){

        for (int i = 0; i < a.length; i++) {
            buildMaxHeap_1(a,i);
        }
        return a;
    }

    //将元素array[k]自下往上逐步调整树形结构
    private void adjustDownToUp(int[] array,int k,int length){
        int temp = array[k];
        for(int i=2*k+1; i<length-1; i=2*i+1){    //i为初始化为节点k的左孩子，沿节点较大的子节点向下调整
            if(i<length && array[i]<array[i+1]){  //取节点较大的子节点的下标
                i++;   //如果节点的右孩子>左孩子，则取右孩子节点的下标
            }
            if(temp>=array[i]){  //根节点 >=左右子女中关键字较大者，调整结束
                break;
            }else{   //根节点 <左右子女中关键字较大者
                array[k] = array[i];  //将左右子结点中较大值array[i]调整到双亲节点上
                k = i; //【关键】修改k值，以便继续向下调整
            }
        }
        array[k] = temp;  //被调整的结点的值放人最终位置
    }

    public static void buildMaxHeap(int[] arr, int offset) {
        // offset开始为0
        for (int i = offset; i < arr.length; i++) {
            // 计算偏移量，后续的⼦数组从偏移量开始视为0脚标
            int j = i-offset;
            while (j > 0) {
                // 定义⽗节点的脚标parentIndex和值parent-不断将⼦节点向上升
                int parent;
                int parentIndex=(j - 1) / 2;
//                boolean even = j % 2 == 0;
//                if (even) {
//                    parentIndex = (j - 2) / 2;
//                } else {
//                    parentIndex = (j - 1) / 2;
//                }
                if (arr[j+offset] > arr[parentIndex+offset]) {
                    parent = arr[parentIndex+offset];
                    arr[parentIndex+offset] = arr[j+offset];
                    arr[j+offset] = parent;
                    j = parentIndex;
                } else {
                    break;
                }
            }
        }
    }

    private static void buildMaxHeap_1(int[] a, int startIndex){
        // 该方法执行一次，找到一个最大值
        for (int i = startIndex; i < a.length; i++) {

            //当前插入的索引,每次索引都从0开始
            int currentIndex = i-startIndex;

            // 找到第i个元素在大根堆中的位置，将0-i中元素构造为大根堆
            while (currentIndex > 0){
                // 重新计算父节点索引
                int fatherIndex = (currentIndex-1)/2;

                if (a[fatherIndex+startIndex] < a[currentIndex+startIndex]){

                    int fatherValue = a[fatherIndex+startIndex];
                    a[fatherIndex+startIndex] = a[currentIndex+startIndex];
                    a[currentIndex+startIndex] = fatherValue;

                    //将当前索引指向父索引，检查父节点是否满足最大堆
                    currentIndex = fatherIndex;

                }
                else break;
            }
        }

}
}
