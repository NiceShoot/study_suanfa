package com.example.study_demo.suanfa.normal;

/**
 * 盛水最多的容器
 */
public class MaxArea {

    /**
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。
     * 在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器。
     */
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int i = maxArea1(arr);

        System.out.println(i);
    }

    // 双指针
    public static int maxArea1(int[] height) {
        int left = 0,right = height.length-1,result = 0;
        while (left<right){
            int l = height[left],r = height[right];
            int min = Math.min(l, r);
            result = Math.max(min * (right-left),result);
            if (l < r)left ++;
            else right --;
        }
        return result;
    }


    public static int maxArea(int[] height) {
        int length = height.length;
        int result = 0;
        for (int i=1;i<length;i++){
            int gao = result / i;
            boolean flag = false;
            for (int j=0;j<(length-i);j++){
                int newGao = Math.min(height[j], height[j + i]);
                if (gao < newGao){
                    gao = newGao;
                    flag = true;
                }
            }
            if (flag) result = i*gao;
        }
        return result;
    }

}
