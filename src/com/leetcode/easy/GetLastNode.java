package com.leetcode.easy;

public class GetLastNode {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null)return null;
        ListNode res = head;
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            cur=cur.next;
        }
        while (cur!=null){
            cur = cur.next;
            res = res.next;
        }
        return res;
    }
}
