package com.example.study_demo.suanfa.easy;

/**
 * 反转链表
 */
public class ReverseList {


    /**
     * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     */
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;
        while (next != null){
            cur.next = pre;
            pre = cur;
            cur = cur.next;
            next = cur.next.next;
        }
        cur.next = cur;
        return cur;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
