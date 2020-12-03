package com.leetcode.easy;
// 双指针
public class ReverseWords_1 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int i = s.length()-1;
        int j = s.length()-1;
        while(i>=0){
            while (i>=0&&s.charAt(i)!=' ')
                i--;
            stringBuilder.append(s.substring(i+1,j+1)+" ");
            while (i>=0&&s.charAt(i)==' ')
                i--;
            j = i;
        }
    return stringBuilder.toString().trim();
    }
}
