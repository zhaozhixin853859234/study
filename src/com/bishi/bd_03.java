package com.bishi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-11 19:49
 */
public class bd_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSamples = sc.nextInt();
        sc.useDelimiter("\n");
        List<List<Integer>> input = new LinkedList<>();
        for (int i = 0; i < numSamples*2; i++) {
            String[] s = sc.nextLine().split(" ");
            List<Integer> tmp = new LinkedList<>();
            for (String str: s) {
                tmp.add(Integer.parseInt(str));
            }
            input.add(tmp);
        }
        int index = 0;
        for (int i = 0; i < numSamples ; i++) {
            if (index<input.size()){
                List<Integer> listParams = input.get(index);
                List<Integer> listData = input.get(++index);
                // 参数数组
                int n = listParams.get(0);
                int k = listParams.get(1);
                // 运算数组
                int[] arrayData = listData.stream().mapToInt(Integer::intValue).toArray();

                int[] p = new int[n];
                p[0] = arrayData[0];
                for (int j = 1; j < n; j++) {
                    p[j] = arrayData[j]^(findKth(Arrays.copyOf(p,j),k));
                }
                System.out.println(p[n-1]);
            }
            else break;
        }

    }

    private static int findKth(int[] input, int k){
        int length = input.length;
        Arrays.sort(input);
        if (length>=k)
            return input[length-k];
        else
            return input[0];
    }
}
