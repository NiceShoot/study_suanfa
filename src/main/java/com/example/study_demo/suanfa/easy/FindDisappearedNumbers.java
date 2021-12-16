package com.example.study_demo.suanfa.easy;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 找到所有数组中消失的数字
 */
public class FindDisappearedNumbers {


    /**
     * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。
     * <p>
     * 请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
     */

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = findDisappearedNumbers(new int[]{4, 3, 2, 4, 8, 2, 3, 1});
        System.out.println(Arrays.toString(disappearedNumbers.toArray()));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cur = Math.abs(nums[i]);
            int tar = nums[cur-1];
            if (tar>0){
                nums[cur-1] = -tar;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        int length = nums.length;
        int[] nums2 = new int[length];
        for (int i = 0; i < length; i++) {
            int cur = nums[i];
            nums2[cur-1] = cur;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (nums2[i]==0){
                list.add(i+1);
            }
        }
        return list;
    }


}
