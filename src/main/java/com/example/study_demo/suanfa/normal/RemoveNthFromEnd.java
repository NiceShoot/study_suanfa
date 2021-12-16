package com.example.study_demo.suanfa.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除链表的倒数第 N 个结点
 */
public class RemoveNthFromEnd {


    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = n + 1;
        List<ListNode> list = new ArrayList<>(count);
        ListNode cur = head;
        while (cur!=null){
            list.add(cur);
            if (list.size()>count){
                list.remove(0);
            }
            cur = cur.next;
            if (cur==null){
                int size = list.size();
                if (size == 1) return null;
                ListNode listNode0 = list.get(0);
                ListNode listNode1 = list.get(1);
                if (size == n) return listNode1;
                if (n==1){
                    listNode0.next = null;
                }else {
                    if (size == 2) return listNode1;
                    else listNode0.next = list.get(2);
                }
            }
        }
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
