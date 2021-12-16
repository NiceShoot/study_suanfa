package com.example.study_demo.suanfa.easy;

/**
 * 汉明距离
 */
public class HammingDistance {


    /**
     * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
     * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
     */
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }


    public static int hammingDistance(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        char[] maxChars = Integer.toBinaryString(max).toCharArray();
        char[] minChars = Integer.toBinaryString(min).toCharArray();
        int maxLength = maxChars.length;
        int minLength = minChars.length;
        int count = 0, a = maxLength-minLength;
        for (int i=0;i<maxLength;i++){
            if (a==0){
                if (maxChars[i] != minChars[i]) count++;
            }else {
                if (minLength<maxLength){
                    minLength++;
                    if (maxChars[i] != '0') count++;
                }else {
                    if (minChars[i-a] != maxChars[i]) count++;
                }
            }
        }
        return count;
    }
}
