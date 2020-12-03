package com.bishi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-07 15:47
 */
public class V3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String[] s = sc.nextLine().split(" ");
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < s.length; j++) {
                list1.add(Integer.parseInt(s[j]));
            }
            list.add(list1);
        }
        list.stream()
                .flatMap(Collection::stream)
                .sorted()
                .forEach(a-> System.out.println(a+" "));
    }
}
