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
            if (cur.next==null){
                ListNode listNode0 = list.get(0);
                if (list.size() < n+1){
                    if (list.size()==1){
                        listNode0 = null;
                    }
                    else if (list.size() == 2){
                        listNode0 = list.get(1);
                    }
                }
                else {
                    listNode0.next = list.get(2);
                }
            }
            cur = cur.next;
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
