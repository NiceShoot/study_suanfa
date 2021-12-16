package com.example.study_demo.suanfa.easy;

/**
 * 比特位计数
 */
public class CountBits {


    /**
     * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
     */
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(1));
        System.out.println(Integer.bitCount(2));
        System.out.println(Integer.bitCount(3));
    }

    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for (int i=0;i<=n;i++){
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }
}
