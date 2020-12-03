package com.leetcode.medium;

import java.util.Stack;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-01 16:59
 */
public class StackSequence31_1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,3,2,1};
        int[] c = {4,3,5,1,2};
        System.out.println(validateStackSequences(a,c));
    }
    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();

        int pushIndex = 1;
        s.push(pushed[0]);
        for (int num: popped) {
            while (!s.isEmpty() && s.peek()!= num){
                if (pushIndex<pushed.length){
                s.push(pushed[pushIndex]);
                pushIndex++;
                }
            }
            s.pop();
        }

        return s.isEmpty();
    }
}
