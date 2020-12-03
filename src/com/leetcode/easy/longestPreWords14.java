package com.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-12 16:11
 */
// 使用了额外的StringBuilder存储结果
public class longestPreWords14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numString = sc.nextInt();
        String[] str = new String[numString];
        for (int i = 0; i <numString ; i++) {
           str[i] = sc.next();
        }
//        String[] strs = {"flower","flow","flight"};
//        String[] strs1 = {"dd","d"};

        System.out.println(Arrays.toString(str));
        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int size = strs.length;
        if (size==0||strs[0].length()==0)
            return "";
        int index = 0;
        while (true){
            char tmp='\0';
            if (index < strs[0].length())
            {
                tmp = strs[0].charAt(index);
                for (int i = 0; i < size; i++) {
                    if (index>=strs[i].length() || strs[i].charAt(index)!=tmp)
                        return res.length()==0?"":res.toString();
                }
                res.append(strs[0].charAt(index));
                index++;
            }
            else
                return res.toString();
        }
    }
}
