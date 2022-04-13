package com.example.study_demo.剑指2;

import java.util.Arrays;

public class 剑指12_矩阵中的路径 {


    /**
     * 给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
     *
     * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
     *
     */

    public static void main(String[] args) {

        //System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
        System.out.println(exist(new char[][]{{'A','A'}},"AAA"));
    }

    public static boolean exist(char[][] board, String word) {
        if (board.length==0) return false;
        char[] wordChars = word.toCharArray();
        int wordCharsLength = wordChars.length;
        boolean result = false;
        int a = board.length;
        int b = board[0].length;
        int a1=0,b1=0;
        for (int j=0;j<b;j++){
            char wordChar = wordChars[0];
            for (int i=0;i<a;i++){
                if (wordChar == board[i][j]){
                    a1=i;b1=j;
                    result = true;
                    break;
                }
            }
        }
        int index = 1;
        while (index<wordCharsLength){
            char thisChar = wordChars[index];
            index ++;
            // 上下
            boolean resultA = true;
            boolean resultB = true;
            if (a==1){
                resultA=false;
            }else {
                if (a1==0){
                    if (thisChar != board[a1+1][b1]){
                        resultA = false;
                    }else {
                        a1 = a1 +1;
                    }
                }else if (a1<a-1){
                    if (thisChar != board[a1+1][b1] && thisChar != board[a1-1][b1]){
                        resultA = false;
                    }else {
                        if (thisChar == board[a1+1][b1]) a1 = a1 +1;
                        if (thisChar == board[a1-1][b1]) a1 = a1 -1;
                    }
                }else if (a1==a-1){
                    if (thisChar != board[a1-1][b1]){
                        resultA = false;
                    }else {
                        a1 = a1 -1;
                    }
                }else {
                    resultA = false;
                }
            }

            // 左右
            if (b==1){
                resultB = false;
            }else {
                if (b1==0){
                    if (thisChar != board[a1][b1+1]){
                        resultB = false;
                    }else {
                        b1 = b1 +1;
                    }
                }else if (b1<b-1){
                    if (thisChar != board[a1][b1+1] && thisChar != board[a1][b1-1]){
                        resultB = false;
                    }else {
                        if (thisChar == board[a1][b1+1]) b1 = b1 +1;
                        if (thisChar == board[a1][b1-1]) b1 = b1 -1;
                    }
                }else if (b1==b-1){
                    if (thisChar != board[a1][b1-1]){
                        resultB = false;
                    }else {
                        b1 = b1 +1;
                    }
                }else {
                    resultB = false;
                }
            }

            if (!resultA && !resultB){
                return false;
            }
        }
        return result;
    }


}
