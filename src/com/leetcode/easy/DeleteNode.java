package com.leetcode.easy;


public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {

        if (head==null) return null;
        if (head.val==val) return head.next;
        ListNode cur = head.next;
        while (cur!=null && cur.next.val!=val){
                cur = cur.next;
        }
        if (cur!=null){
            cur = cur.next;
        }
        return head;


    }
}
