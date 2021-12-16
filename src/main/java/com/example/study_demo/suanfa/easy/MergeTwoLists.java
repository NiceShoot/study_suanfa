package com.example.study_demo.suanfa.easy;

/**
 * 合并两个有序链表
 */
public class MergeTwoLists {
    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * 示例 1：
     * 输入：l1 = [1,2,4], l2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
     *
     * 示例 2：
     * 输入：l1 = [], l2 = []
     * 输出：[]
     *
     * 示例 3：
     * 输入：l1 = [], l2 = [0]
     * 输出：[0]
     *
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;

        ListNode listNode;
        listNode = l1.val <= l2.val ? l1 : l2;
        if (listNode.val == l1.val){
            listNode.next = mergeTwoLists(listNode.next,l2);
        }
        else {
            listNode.next = mergeTwoLists(listNode.next,l1);
        }
        return listNode;
    }





    public class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
