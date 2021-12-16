package com.example.study_demo.suanfa.easy;

import java.util.Stack;

/**
 * 有效的括号
 */
public class IsValid {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *
     * 如：
     * 输入：s = "()"
     * 输出：true
     *
     * 输入：s = "{[]}"
     * 输出：true
     *
     */

    public static void main(String[] args) {
        boolean valid = isValid("(([]){})");
        System.out.println(valid);
    }


    public static boolean isValid(String s) {
//        int length = s.length();
//        for (int i=0;i<length/2;i++){
//            s = s.replace("[]","").replace("{}","").replace("()", "");
//        }
//        return s.length()==0;
        Stack<Character> characters = new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='(')
                characters.push(')');
            else if (c=='{')
                characters.push('}');
            else if (c=='[')
                characters.push(']');
            else if(characters.isEmpty() || c!=characters.pop())
                return false;
        }
        return characters.isEmpty();
    }
}
