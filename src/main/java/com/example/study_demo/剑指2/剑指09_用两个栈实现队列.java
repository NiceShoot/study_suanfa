package com.example.study_demo.剑指2;

import java.util.ArrayList;
import java.util.List;

public class 剑指09_用两个栈实现队列 {


    /**
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
     * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     */
    private List<Integer> list1;
    public 剑指09_用两个栈实现队列() {
        list1 = new ArrayList<>();
    }

    public void appendTail(int value) {
        list1.add(value);
    }

    public int deleteHead() {
        if (list1.size()==0) return -1;
        Integer integer = list1.get(0);
        list1.remove(0);
        return integer;
    }
}
