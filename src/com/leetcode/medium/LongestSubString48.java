package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-10 14:10
 */
public class LongestSubString48 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len<=1)
            return len;

        char[] chars = s.toCharArray();
        if (len==2)
            return chars[0]==chars[1]?1:2;

        int start = 0;
        int end = 1;
        int lengthOfSubString = 1;

        while (end<len){
            for (int i = start; i < end ; i++) {
                if (chars[i]==chars[end]){
                    lengthOfSubString = Math.max(lengthOfSubString,end-start);
                    start = end;
                    end = start+1;
                    break;
                }
                if (i==end-1){
                    end++;
                    lengthOfSubString = Math.max(lengthOfSubString,end-start);
                    break;
                }
            }
        }
        return lengthOfSubString;
    }

}
