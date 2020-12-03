package com.leetcode.medium;

import java.util.regex.Pattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-15 21:02
 */
public class String2Int_1 {
    public static void main(String[] args) {
//        String pattern = "[+,-]?(\\d+)";
//
//        System.out.println(Pattern.matches(pattern,"words and 987"));

        String s = "words and 987";
        System.out.println(strToInt(s));
    }

    public static int strToInt(String str) {
        String pattern = "[+,-]?(\\d+)";
        String s = str.trim();
        int res;
        int i = s.length();
        while (i>=0){
            if (!Pattern.matches(pattern,s.substring(0,i))){
                i--;
            }
            else break;
        }

        if (i<=0)
            return 0;
        if (i==1 && (s.charAt(0)-'0')>=0 && (s.charAt(0)-'0')<=9)
            return Integer.parseInt(String.valueOf(s.charAt(0)));
        if (i==1)
            return 0;

        try{
            res = Integer.parseInt(s.substring(0,i));
        }catch (Exception e){
            if (s.charAt(0)=='-')
                return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;

        }

        return res;
    }
}
