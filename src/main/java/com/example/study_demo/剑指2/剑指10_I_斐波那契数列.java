package com.example.study_demo.剑指2;

public class 剑指10_I_斐波那契数列 {


    /**
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1
     *
     *
     * 输入：n = 2
     * 输出：1
     *
     * 输入：n = 5
     * 输出：5
     */

    public static void main(String[] args) {
        System.out.println(fib(44));
    }

    public static int fib(int n) {
        int i = fib2(n);
        return i % 1000000007;
    }

    public static int fib2(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fib2(n-1)+fib2(n-2);
    }
}
