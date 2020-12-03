package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-08-29 19:19
 */
public class KDXF_new_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        StringBuilder sb = new StringBuilder();

        int start = 0;
        while(input.charAt(start)=='_'){
            start++;
        }

        int end = len-1;
        while (input.charAt(end)=='_')
            end--;

        for (int i = start; i <end+1; i++) {
            if (input.charAt(i)!='_')
                sb.append(input.charAt(i));
            else {
                sb.append(input.charAt(i));
                i = i+1;
                while(input.charAt(i)=='_')
                    i++;
                i = i-1;
            }
        }
        System.out.println(sb.toString());
    }
}
