package com.leetcode.medium;


import java.util.ArrayList;
import java.util.List;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-10 15:04
 */
public class LastNNode_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = head;
        List<ListNode> temp = new ArrayList<>();
        int count = 0;
        while(head!=null){
            temp.add(head);
            head = head.next;
            count++;
        }

        //int size = temp.size();
        ListNode lastN = temp.get(count-n);
        if (count-n-1>=0){
            ListNode lastNBefore = temp.get(count-n-1);
            lastNBefore.next = lastN.next;
            return res;
        }
        else
            return res.next;

    }

    public static void main(String[] args) {

    }
}
