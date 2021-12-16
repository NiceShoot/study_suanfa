package com.example.study_demo.suanfa.easy;

import java.util.Arrays;

/**
 * 只出现一次的数字
 */
public class SingleNumber {

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     */
    public static void main(String[] args) {
        //int[] arr = {3,20,13,2,1,6,7,19,9,10};
        int[] arr = {1,4,7,2,4,2,1};
        int i = singleNumber(arr);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        for (int i=0;i<length;i=i+2){
            int num = nums[i];
            if (i == length-1 || num != nums[i+1]){
                return num;
            }
        }
        return 0;
    }


    /**
     * 不需要额外空间的方法，就往位运算上想
     *
     * 交换律：a ^ b ^ c <=> a ^ c ^ b
     *
     * 任何数于0异或为任何数 0 ^ n => n
     *
     * 相同的数异或为0: n ^ n => 0
     */
    public static int singleNumber2(int[] nums) {
        return Arrays.stream(nums).reduce((a,b)->a^b).getAsInt();
    }


}
