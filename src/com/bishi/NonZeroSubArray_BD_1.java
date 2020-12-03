package com.bishi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <h3>study</h3>
 * @author : zhao
 * @version :
 * @date : 2020-07-25 10:50
 */
public class NonZeroSubArray_BD_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.useDelimiter("\n");
        String[] str = sc.next().split(" ");

        int[] input = new int[n];
        int count =0;
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
            if (input[i]!=0)
                count++;
        }

        System.out.println(count);
        for (int i = 1; i <n ; i++) {
            input[i] = input[i]+input[i-1];
            if (input[i]!=0)
                count++;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(input));
        Map<Integer,Integer> map = new HashMap<>();
        map.put(input[0],0);
        for (int i = 1; i < n; i++) {
            if (!map.containsKey(input[i]))
                map.put(input[i],i);
                count++;
        }
        System.out.println(count);
    }
}
