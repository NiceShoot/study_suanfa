package com.example.study_demo.suanfa.easy;

import java.util.Arrays;

/**
 * 多数元素
 */
public class MajorityElement {


    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于[n/2]的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     */
    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        Arrays.sort(nums);
        return nums[length/2];
    }


    public int majorityElement2(int[] nums) {
        int count = 1;
        int num = nums[0];

        for (int i=1;i<nums.length;i++){
            if (num == nums[i]){
                count++;
            }else {
                count--;
                if (count == 0){
                    num = nums[i+1];
                }
            }
        }
        return num;
    }
}
