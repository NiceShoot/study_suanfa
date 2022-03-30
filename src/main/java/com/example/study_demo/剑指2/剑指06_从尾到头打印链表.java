package com.example.study_demo.剑指2;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class 剑指06_从尾到头打印链表 {


    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     */
    public static void main(String[] args) {


    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i=0;i<size;i++){
            result[i] = stack.pop();
        }
        return result;
    }



    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
