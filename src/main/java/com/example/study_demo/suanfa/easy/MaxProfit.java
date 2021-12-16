package com.example.study_demo.suanfa.easy;

import java.util.Arrays;

/**
 * 买卖股票的最佳时机
 */
public class MaxProfit {


    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     *
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     *
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     *
     */

    public static void main(String[] args) {
        //int[] arr = {3,20,13,2,1,6,7,19,9,10};
        int[] arr = {7,2,4,1};
        int i = maxProfit(arr);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        int minIndex=0,maxIndex=0;
        int minPrice=prices[0],maxPrice=0;
        for (int i=0;i<length;i++){
            int price = prices[i];
            minIndex = price<minPrice?i:minIndex;
            minPrice = Math.min(price,minPrice);
            maxIndex = price>maxPrice?i:maxIndex;
            maxPrice = Math.max(price, maxPrice);
        }
        if (maxIndex>=minIndex){
            return maxPrice-minPrice;
        }
        int i = maxProfit(Arrays.copyOfRange(prices, 0, maxIndex+1));
        int i2 = maxProfit(Arrays.copyOfRange(prices, minIndex, length));
        int i3 = maxProfit(Arrays.copyOfRange(prices, maxIndex, minIndex));
        return Math.max(Math.max(i,i2),i3);
    }

    public int maxProfit2(int[] prices) {
        int length = prices.length;
        int money = 0;
        for (int i=0;i<length-1;i++){
            int price1 = prices[i];
            for (int j=i+1;j<length;j++){
                int price2 = prices[j] - price1;
                if (price2>money){
                    money = price2;
                }
            }
        }
        return money;
    }

}
