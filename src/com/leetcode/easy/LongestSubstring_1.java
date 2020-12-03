package com.leetcode.easy;

import java.util.HashMap;

public class LongestSubstring_1 {
    public static int lengthOfLongestSubstring(String s) {
        // 保存每次字串长度
        int subdtringNum = 0;
        //HahMap保存每次字符串，和其长度
        HashMap<Character,Integer> hm = new HashMap<>();
        int sLength = s.length();
        if (sLength==0){
            return 0;
        }else if(sLength==1){
            return 1;
        }
        else {
            //用索引记录字串长度
        for (int i = 0; i <sLength-1 ; i++) {
            hm.put(s.charAt(i),1);
            for (int j = i+1; j <sLength ; j++) {
                if (!hm.containsKey(s.charAt(j))){
                    hm.put(s.charAt(j),1);
                    subdtringNum = Math.max(subdtringNum, hm.size());
                    System.out.println(hm.toString());
                    System.out.println(subdtringNum);
                }else {
                    subdtringNum = Math.max(subdtringNum, hm.size());
                    System.out.println(subdtringNum);
                    hm.clear();
                    break;
                }
            }
        }
        return subdtringNum;
        }
    }

    public static void main(String[] args) {
        String s = "jbpnbwwd";
        int ss = lengthOfLongestSubstring(s);
        System.out.println(ss);
    }
}
