package com.leetcode.easy;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-09 21:03
 */
public class ListMerge_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        else{
            ListNode res = new ListNode();
            ListNode head = res;
            while(l1!=null && l2!=null){
                if (l1.val>l2.val){
                    res.next = new ListNode(l2.val);
                    res = res.next;
                    if (l2.next!=null)
                        l2 = l2.next;
                    else{
                        l2 = null;
                        break;
                    }
                }
                else{
                    res.next = new ListNode(l1.val);
                    res = res.next;
                    if (l1.next!=null)
                        l1 = l1.next;
                    else{
                        l1=null;
                        break;}
                }

            }

            if (l1==null)
                res.next = l2;
            if (l2==null)
                res.next = l1;

            return head.next;

        }
    }


    public static void main(String[] args) {
        ListNode listNode =new ListNode(1);
    }
}
