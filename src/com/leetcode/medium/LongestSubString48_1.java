package com.leetcode.medium;

import java.util.HashMap;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-10 14:59
 */
// 哈希表+滑动窗口
public class LongestSubString48_1 {
    public static int lengthOfLongestSubstring(String s) {
        int len  = s.length();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int max = 0;
        int start = -1;

        for (int i = 0; i < len; i++) {
            char tmp = s.charAt(i);

            if (hashMap.containsKey(tmp))
                start = Math.max(start, hashMap.get(tmp));

            hashMap.put(tmp,i);

            max = Math.max(max,i-start);
        }
        return max;


    }
}
