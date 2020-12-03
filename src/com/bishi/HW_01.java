package com.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-06 19:04
 */
public class HW_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        List<List<Integer>> input = new ArrayList<>();

        while (temp.length()>=2){
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < temp.length(); i++) {
                tempList.add(Integer.parseInt(String.valueOf(temp.charAt(i))));
            }
            input.add(tempList);
            temp = sc.nextLine();
        }
        int threshold = Integer.parseInt(temp);
        String targetStr = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < targetStr.length(); i++) {
            String tempString = String.valueOf(targetStr.charAt(i));
            if (Integer.parseInt(tempString)<threshold)
                sb.append(tempString);
        }

        for (List<Integer> list:input) {
            StringBuilder sbTemp = new StringBuilder();
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)<threshold)
                    sbTemp.append(list.get(i));
            }
            if (sbTemp.toString().contains(sb.toString())){
                for (int num:list) {
                    System.out.print(num);
                }
                System.out.println();
            }

        }


//        String a = "abc";
//        String b = "abv";
//        System.out.println(a.contains(b));

//        for (List<Integer> list:input) {
//            for (int num:list) {
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(threshold);
//        System.out.println(targetStr);

    }
}
