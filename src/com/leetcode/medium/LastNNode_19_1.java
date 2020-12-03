package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-10 15:22
 */

//双指针,两个指针之间有n个元素
public class LastNNode_19_1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeHead = new ListNode(-1);
        beforeHead.next = head;

        ListNode before = beforeHead;
        ListNode after = beforeHead;

        int count = 0;
        while(after!=null){
            if (count<=n){
                after = after.next;
                count++;
            }
            else {
                after = after.next;
                before = before.next;
            }
        }
        // 当删除头结点时，before.next和beforeHead.next是同一个指针
        // 相当于 beforeHead.next = beforeHead.next.next,删除头结点
        before.next = before.next.next;
        return beforeHead.next;
    }
}
