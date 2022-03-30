package com.example.study_demo.剑指2;

public class 剑指05_替换空格 {


    /**
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     */


    public static void main(String[] args) {

        String str = "    ";

        char[] chars = str.toCharArray();
        Character character = ' ';
        System.out.println(chars[0] == character);



    }

    public String replaceSpace(String s) {

        // 方法1
        //String s1 = s.replaceAll(" ", "%20");

        // 方法2
        char[] chars = s.toCharArray();
        char character = ' ';
        String str = "%20";
        StringBuilder result = new StringBuilder();
        for(int i=0;i<chars.length;i++){
            char aChar = chars[i];
            if(aChar == character){
                result.append(str);
            }else {
                result.append(aChar);
            }
        }
        return result.toString();
    }
}
