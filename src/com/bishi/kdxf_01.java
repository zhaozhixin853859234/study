package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-31 14:04
 */
public class kdxf_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] input = new int[str.length];
        int[] money = {1,5,10,50,100};
        for (int i = 0; i < str.length; i++) {
            input[i] = Integer.parseInt(str[i]);
        }
        int k = sc.nextInt();
        int count =0;
        for (int i = money.length-1; i >=0; i--) {
            while (k>=money[i] && input[i]>0){
                k-=money[i];
                input[i]-=1;
                count++;
            }
        }
        if (k==0)
            System.out.println(count);
        else
            System.out.println(-1);

    }
}
