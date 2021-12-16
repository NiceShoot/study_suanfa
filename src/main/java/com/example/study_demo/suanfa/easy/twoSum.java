package com.example.study_demo.suanfa.easy;

/**
 * 两数之和
 */
public class twoSum {


    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * 你可以按任意顺序返回答案。
     */
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i=0;i<length;i++){
            int i1 = target - nums[i];
            for (int j=i+1;j<length;j++){
                if (i1==nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

}
