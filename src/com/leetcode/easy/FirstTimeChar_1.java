package com.leetcode.easy;

import java.util.HashMap;

// 有序哈希表
public class FirstTimeChar_1 {
    public static  char firstUniqChar(String s) {
        HashMap<Character,Boolean> hashMap = new HashMap<>();
        // 有序哈希表
        // Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for (char i:sc) {
            hashMap.put(i,!hashMap.containsKey(i));
        }
        for (char i:sc) {
            if (hashMap.get(i))
                return i;
        }
        return ' ';

    }

    public static void main(String[] args) {
        String s= "lleetcode";
        char res = firstUniqChar(s);

        System.out.println(res);
    }
}
