package com.example.study_demo.suanfa.easy;

import java.util.*;

/**
 * 最小栈
 */
public class MinStack {
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    /**
     * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
     *
     * push(x) —— 将元素 x 推入栈中。
     * pop()—— 删除栈顶的元素。
     * top()—— 获取栈顶元素。
     * getMin() —— 检索栈中的最小元素。
     */

    // 栈，先进后出
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()){
            stack.push(val);
            stack.push(val);
        }else {
            Integer peek = stack.peek();
            stack.push(val);
            stack.push(val<peek?val:peek);
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size()-2);
    }

    public int getMin() {
        return stack.peek();
    }
}
