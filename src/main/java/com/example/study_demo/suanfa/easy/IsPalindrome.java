package com.example.study_demo.suanfa.easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * 回文链表
 */
public class IsPalindrome {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(Arrays.toString(stack.toArray()));
    }

    /**
     * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
     */
    public boolean isPalindrome(ListNode head) {

        if (head == null) return false;
        Stack<Integer> stack = new Stack<>();
        ListNode c = head;
        while (c!=null){
            stack.push(c.val);
            c = c.next;
        }

        ListNode d = head;
        while (d!=null){
            if (stack.pop() != d.val){
                return false;
            }
            d = d.next;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
