package com.example.study_demo.剑指2;

public class 剑指10_II_青蛙跳台阶问题 {


    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     * f(n) =  f(n-1)+f(n-2)
     *
     * 输入：n = 0
     * 输出：1
     *
     * 输入：n = 1
     * 输出：1
     *
     * 输入：n = 2
     * 输出：2
     *
     * 输入：n = 3
     * 输出：3
     *
     * 输入：n = 5
     * 输出：5
     *
     * 输入：n = 6
     * 输出：8
     *
     * 输入：n = 7
     * 输出：21
     *

     */

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }

    public static int numWays(int n) {
        if (n==0)return 1;
        if (n==1)return 1;
        int[] arr = new int[n+1];
        arr[0] = 1;arr[1] = 1;
        for (int i=2;i<n+1;i++){
            arr[i] = (arr[i-1]+arr[i-2])% 1000000007;
        }
        return arr[n];
    }


}
