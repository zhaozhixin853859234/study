package com.leetcode.easy;

public class ShareNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1!=node2) {
            node1 = node1== null ? headB : node1.next;
            node2 = node2== null ? headA : node2.next;
// 通过
//            node1 = node1!= null ? node1.next:headB ;
//            node2 = node2!= null ? node2.next:headA;


// 不通过，
// 可以理解为两条链表最后都指向了同一个 null （None）节点，
// 代替了不相交的特殊情况。 非常的巧妙。不适用于不相交情况
            // 当循环M+N次后，node1 = headB，node2 = headA，
            // 应该让二者在循环M+N次后，没有相交节点，返回null并结束循环
            // 这种写法会进入死循环。
//            node1 = node1.next != null ? node1.next: headB;
//            node2 = node2.next != null ? node2.next: headA;
        }
        return node1;
    }
}

