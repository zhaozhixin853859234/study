package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-08-29 16:05
 */
public class MT_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.useDelimiter("\n");

        String s = sc.next();
        int start = 0;
        int end = 0;
        for (int i = 0; i <n ; i++) {
            if (s.charAt(i)=='T'){
                start = i+1;
                break;
            }
        }

        for (int i = n-1; i >0 ; i--) {
            if (s.charAt(i)=='M'){
                end = i-1;
                break;
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.print(s.charAt(i));
        }
    }
}
