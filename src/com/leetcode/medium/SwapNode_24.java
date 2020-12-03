package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-10 16:01
 */
public class SwapNode_24 {
    public static ListNode swapPairs(ListNode head) {
        ListNode before = new ListNode(-1);
        ListNode after = new ListNode(-2);
        ListNode res = new ListNode(-3);
        int count = 0;
        while(head!=null){
            if (count%2==0){
                before.next = head;
                before = before.next;
            }
            else {
                after.next = head;
                after = after.next;
            }
            count++;
            head = head.next;
        }

        while(before!=null && after!=null){
            res.next = after;
            res = after.next;
            res.next = before;
            res = before.next;
            after = after.next;
            before = before.next;
        }

        if (before==null){
            res.next = after;
        }
        else
            res.next = before;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);

        swapPairs(test);
        while(test!=null){
            System.out.println(test.val+" ");
            test = test.next;
        }

    }
}
