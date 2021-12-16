package com.example.study_demo.sort;

import java.util.Arrays;

public class XuanZe {


    public static void main(String[] args) {

        int[] sort = sort(new int[]{12, 6, 23, 6, 5, 3, 1});

        System.out.println(Arrays.toString(sort));

    }



    public static int[] sort(int[] arr){

        for (int i=0;i<arr.length;i++){
            int index = i;
            int min = arr[i];
            for (int j=i;j<arr.length;j++){
                if (arr[j]<min){
                    min = arr[j];
                    index =  j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        return arr;
    }



}
