package com.example.study_demo.suanfa.normal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 最长回文子串
 */
public class LongestPalindrome {


    public static void main(String[] args) {
        String babad = longestPalindrome("fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");

        System.out.println(babad);
    }

    /**
     * 给你一个字符串 s，找到 s 中最长的回文子串
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        if (length == 1) return s;
        List<Character> list = new ArrayList<>();
        int maxLength = 0;
        String str = chars[0]+"";
        for (int i = 0;i<length;i++){
            if (maxLength < length-i){
                list.add(chars[i]);
                for (int j = i+1;j<length;j++){
                    list.add(chars[j]);
                    boolean palindrome = isPalindrome(list);
                    if (palindrome){
                        int size = list.size();
                        if (maxLength<size){
                            str = list.stream().map(Object::toString).collect(Collectors.joining(""));
                            maxLength = size;
                        }
                    }
                }
            }
            list.clear();
        }
        return str;
    }


    public static boolean isPalindrome(List<Character> chars) {
        int length = chars.size();
        int max = length/2;
        if (length % 2 != 0)  max = max+1;
        for (int i=0;i<max;i++){
            if (chars.get(i)!=chars.get(length-1-i)){
                return false;
            }
        }
        return true;
    }



}
