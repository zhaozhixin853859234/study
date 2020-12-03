package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-31 14:36
 */
public class kdxf_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb =new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]))
                sb.append(chars[i]);
        }
        System.out.println(sb);
    }
}
