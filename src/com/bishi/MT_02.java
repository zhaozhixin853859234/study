package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-06 10:23
 */
public class MT_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i <str.length() ; i++) {
            char temp = str.charAt(i);
            if (temp>='A'&&temp<='Z')
                countUpper++;
            else
                countLower++;
        }

        System.out.println(Math.abs(countLower-countUpper)/2);
    }
}
