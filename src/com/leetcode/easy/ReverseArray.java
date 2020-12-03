package com.leetcode.easy;

import java.util.Stack;

public class ReverseArray {
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> ss = new Stack<>();
        while (head!=null){
            ss.push(head.val);
            head = head.next;
        }
        int size = ss.size();
        int[] r= new int[size];
        for (int i = 0; i <r.length ; i++) {
            r[i]=ss.pop();
            System.out.println(r[i]);
        }
        return r;
    }

    public static void main(String[] args) {
        ListNode tt = new ListNode(1);
        tt.next=new ListNode(2);
        tt.next.next=new ListNode(3);
        //tt.next.next = new
        while (tt!=null){
            System.out.println(tt.val);
            tt = tt.next;
        }
        int[] res = reversePrint(tt);
        for (int i:res) {

        }
    }
}

