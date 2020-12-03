package com.leetcode.easy;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-09 19:55
 */
// 数字转换为字符串处理
public class huiwen_9_1 {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i)!=str.charAt(length-i-1))
                return false;
        }
        return true;
    }

}
