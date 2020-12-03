package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-09 20:03
 */
// 利用数组
public class huiwen_9_2 {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        List<Integer> list = new ArrayList<>();
        while (x!=0){
            list.add(x%10);
            x /= 10;
        }
        int length = list.size();
        for (int i = 0; i < length/2; i++) {
            if (!list.get(i).equals(list.get(length - i - 1)))
                return false;
        }
        return true;
    }

}
