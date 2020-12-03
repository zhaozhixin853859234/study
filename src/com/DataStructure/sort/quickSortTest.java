package com.DataStructure.sort;

import java.util.Arrays;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-10 13:29
 */
public class quickSortTest {

    public static void main(String[] args) {
        int[] array = {1,2,56,12,34,1,3};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] input,int left,int right){
        if (left<right){
            int pivot = partition(input,left,right);
            quickSort(input,left,pivot-1);
            quickSort(input,pivot+1,right);
        }

    }

    public static int partition(int[] input,int left,int right){
        int tmp = input[left];

        while(left<right){

            while (left<right && input[right]>=tmp)
                right--;
            input[left] = input[right];

            while(left<right && input[left]<=tmp)
                left++;
            input[right] = input[left];
        }

        input[left] = tmp;
        return left;
    }

}
