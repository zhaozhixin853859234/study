package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-08-01 15:28
 */
public class bs_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll(",","");
        int a = Integer.parseInt(s);
        System.out.println(a);

    }
}
