package com.leetcode.easy;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-12 16:32
 */
// 不用StringBuilder，找到截至索引
public class longestPreWords14_1 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"dd","d"};
        System.out.println(longestCommonPrefix(strs1));
    }
    public static String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size==0||strs[0].length()==0)
            return "";
        int end = 0;
        while(true){
            char tmp='\0';
            if (end < strs[0].length())
            {
                tmp = strs[0].charAt(end);
                for (int i = 1; i < size; i++) {
                    if (end>=strs[i].length() || strs[i].charAt(end)!=tmp)
                        return strs[0].substring(0,end);
                }
                end++;
            }
            else
                return strs[0].substring(0,end);
        }

    }
}
