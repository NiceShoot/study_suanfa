package com.example.study_demo.suanfa.easy;

import java.util.Arrays;

/**
 * 移动归零
 */
public class MoveZeroes {


    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     */

    public static void main(String[] args) {
        int[] arr = {1,0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void moveZeroes(int[] nums) {

        int length = nums.length;
        int index = 0;
        for (int i=1;i<length;i++){
            if (nums[index]!=0) {
                index++;
            }else {
                int num1 = nums[i];
                if (num1!=0){
                    nums[index] = num1;
                    nums[i] = 0;
                    index ++;
                }
            }
        }
    }
}
