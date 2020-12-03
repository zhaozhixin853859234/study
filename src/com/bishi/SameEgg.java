package com.bishi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-29 09:05
 */
public class SameEgg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.useDelimiter("\n");
        String[] str = sc.next().split(" ");
        int[] input = new int[n];
        for (int i = 0; i <n ; i++) {
            input[i] = Integer.parseInt(str[i]);
        }
        int count = 0;
        boolean flag = true;
        while(flag){
            Arrays.sort(input);
            System.out.println(Arrays.toString(input));
            Set<Integer> set = new HashSet<>();
            for (int i = n-1; i >=0 ; i--) {
                input[i]=input[i]+i+1;
                if (!set.add(input[i])){
                    flag = false;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
