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
     * 0-0,1-1,2-1，3-2,4-3，5-5
     *
     * 输入：n = 2
     * 输出：1
     *
     * 输入：n = 5
     * 输出：5
     */

    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a=1,b=0;
        for (int i=1;i<n;i++){
          a = b+a;
          b = a-b;
          a = a%1000000007;
        }
        return a;
    }


}
