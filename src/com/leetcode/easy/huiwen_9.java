package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-09 19:39
 */
// 用栈，数字每一位进栈顺序与出栈顺序相同时，为回文数字
public class huiwen_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
        if (x<0)
            return false;
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (x!=0){
            int yushu = x%10;
            stack.push(yushu);
            list.add(yushu);
            x = x/10;
        }
        int index = 0;
        while (!stack.isEmpty()){
            if (!stack.pop().equals(list.get(index++))){
                return false;
            }

        }
        return true;

    }

}
