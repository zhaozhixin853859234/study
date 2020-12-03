package com.bishi;

import java.util.Scanner;


/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-18 19:18
 */

public class BD_Mount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int len = str.length;
        int[] input = new int[len];
        for (int i = 0; i <len ; i++) {
            input[i] = Integer.parseInt(str[i]);
        }
        if (len==0)
            System.out.print("");
        else if (len==1)
            System.out.print(input[0]);
        else{
            // 前后两个指针
            int i =0;
            int j = len-1;
            int tmp= Math.min(input[0], input[len - 1]);

            if (len==2&&input[0]==input[1])
                System.out.print(input[0]);
            else {
                System.out.print(tmp+",");
            while(i<=j){
                if (input[i]<input[j]){
                    // 去重
                    if (input[i]==tmp){
                        i++;
                    }else {
                        // 去掉末尾逗号
                        if (i==j)
                            System.out.print(input[i]);
                        else
                            System.out.print(input[i]+",");
                        tmp=input[i];
                        i++;
                    }
                }

                else {
                    if (input[j]==tmp){
                        j--;
                    }else {
                        if (i==j)
                            System.out.print(input[j]);
                        else
                            System.out.print(input[j]+",");
                        tmp=input[j];
                        j--;
                    }
                }
            }

            }
        }
    }
}
