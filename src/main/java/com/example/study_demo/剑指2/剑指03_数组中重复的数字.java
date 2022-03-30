package com.example.study_demo.剑指2;

import java.util.HashSet;
import java.util.Set;

public class 剑指03_数组中重复的数字 {

    /**
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
