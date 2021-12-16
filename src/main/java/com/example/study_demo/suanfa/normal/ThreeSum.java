package com.example.study_demo.suanfa.normal;

import javafx.beans.binding.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class ThreeSum {


    /**
     * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？
     * 请你找出所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     */

    public static void main(String[] args) {
        //int[] arr = {-2,0,0,2,2};
        int[] arr = {0,0,0};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        if (length < 3) return new ArrayList<>(1);
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i=0;i<length;i++){
            int left = i+1,right = length-1,num = nums[i];
            if (i-1>=0 && num==nums[i-1]) continue;
            if (num<=0){
                while (left<right){
                    int l = nums[left],r = nums[right];
                    int sum = num + l + r;
                    if (sum == 0){
                        List<Integer> list = new ArrayList<>(3);
                        list.add(num);list.add(l);list.add(r);
                        resultList.add(list);
                        right --;
                        left ++;
                        while (l==nums[left] && left<length-1)left ++;
                        while (r == nums[right] && right-1>=0)right --;
                    }else if(sum>0){
                        right -- ;
                        while (r == nums[right] && right-1>=0)right --;
                    }else {
                        left ++;
                        while (l==nums[left] && left<length-1)left ++;
                    }
                }
            }
        }
        return resultList;
    }

}
