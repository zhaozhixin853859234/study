package com.leetcode.easy;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        // 记录无重复字串的起始和终止位置
        int startIndex = 0;
        int endIndex = 0;
        //无重复字串的长度
        int substringLength = 0;

        // 将字符串s存入数组
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i]!=charArray[i-1]){
                endIndex = i;
                if (endIndex-startIndex+1>substringLength)
                    substringLength = endIndex-startIndex+1;
            }
            else{
                substringLength = endIndex-startIndex-1;
                startIndex = i;
            }
        }
    return substringLength;

    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
