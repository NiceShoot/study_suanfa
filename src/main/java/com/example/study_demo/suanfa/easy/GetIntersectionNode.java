package com.example.study_demo.suanfa.easy;

/**
 * 相交链表
 */
public class GetIntersectionNode {


    /**
     * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
     * 如果两个链表不存在相交节点，返回 null 。
     *
     * 题目数据 保证 整个链式结构中不存在环
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA==null || headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;

        while (a != b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
        }
        return a;
    }




    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
