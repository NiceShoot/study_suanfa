package com.example.study_demo.suanfa.normal;

import java.util.*;

/**
 * 电话号码的字母组合
 */
public class LetterCombinations {


    /**
     * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     *
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     */

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("1234");
        s.deleteCharAt(2);
        System.out.println(s.toString());
    }


    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> map = getMap();
        backtrack(combinations,map,digits,0,new StringBuffer());
        return combinations;
    }

    /**
     * 回溯算法
     */
    public void backtrack(List<String> combinations,Map<Character, String> map,String digits,int index, StringBuffer combination){

        if (index == digits.length()){
            combinations.add(combination.toString());
        }else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int length = letters.length();
            for (int i=0;i<length;i++){
                combination.append(letters.charAt(i));
                backtrack(combinations,map,digits,index+1,combination);
                combination.deleteCharAt(index);
            }
        }

    }


    private Map<Character,String> getMap() {
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        return  phoneMap;
    }

}
