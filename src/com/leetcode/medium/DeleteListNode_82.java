package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-11 14:58
 */
public class DeleteListNode_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode pre = head;
        ListNode after = head.next;
        while (after!=null){
            if (cur.val == after.val){
                while(cur.val == after.val){
                    after = after.next;
                }
                pre.next = after;
                cur = after;
                after = after.next;
            }
            else {
                pre = pre.next;
                cur = cur.next;
                after = after.next;
            }

        }
        return head;
    }
}
