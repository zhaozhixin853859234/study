package com.leetcode.medium;

import java.util.Stack;

/**
 * <h3>study</h3>
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，
 * 序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-01 16:01
 */
public class StackSequence31 {
    private StackSequence31(){

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,3,2,1};
        int[] c = {4,3,5,1,2};
        System.out.println(validateStackSequences(a,c));
    }
    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();

        int popIndex = 0;

        for (int num:pushed) {
            s.push(num);
            while (!s.isEmpty() && s.peek()==popped[popIndex]){
                s.pop();
                popIndex++;
            }
        }
        return s.isEmpty();

    }
}
