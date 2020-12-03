package com.leetcode.easy;

public class AddNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        // 进位标志
        int carry = 0 ;
        while(l1!=null||l2!=null){
            // 位数不足补0
            int x = l1.next==null ? 0 : l1.val;
            int y = l2.next==null ? 0 : l2.val;

            // 对应位数相加之和
            int sum = x + y + carry;
            // 判断是否进为，为1时进位，否则不进位
            carry = sum/10;
            sum = sum%10;

            cur.next = new ListNode(sum);
            cur = cur.next;

            // 防止位数不同时，报空指针错误
            if (l1!=null){
            l1 = l1.next;
            }
            if (l2!=null){
            l2 = l2.next;
            }
        }
        // 判断最高一位是否需要增加一位，补一个1
        if (carry==1){
            cur.next=new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
        ListNode res = addTwoNumbers(a,b);

        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
// Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
// }

