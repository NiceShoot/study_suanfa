package com.example.study_demo.剑指2;

public class 剑指13_机器人的运动范围 {


    /**
     * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
     * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
     * 也不能进入行坐标和列坐标的数位之和大于k的格子。
     * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
     *
     * 请问该机器人能够到达多少个格子？
     *
     * 输入：m = 2, n = 3, k = 1
     * 输出：3
     *
     * 输入：m = 3, n = 1, k = 0
     * 输出：1
     *
     * 回溯法
     */

    public static void main(String[] args) {
       System.out.println(movingCount(38,15,9));
    }

    public static int movingCount(int m, int n, int k) {
        return 0;
    }


}
