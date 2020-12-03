package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-19 16:28
 */

// 时间超限
public class LongestHuiWen5 {
    public static String longestPalindrome(String s) {
        int len = s.length();
        if(len==1||len==0)
            return s;
        int start=0;
        int end = 0;
        int maxLength= 0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(isPalindrome(s.substring(i,j+1))){
                    if((j-i)>maxLength){
                        maxLength = j-i;
                        start = i;
                        end = j;
                    }
                }

            }

        }
        return s.substring(start,end+1);
    }

    public static boolean isPalindrome(String s){
        int len = s.length();
        if(len==1)
            return true;
        else{
            int i = 0;
            int j = len-1;
            while(i<j){
                if(s.charAt(i++)!=s.charAt(j--))
                    return false;
            }
            return true;
        }
    }

}
