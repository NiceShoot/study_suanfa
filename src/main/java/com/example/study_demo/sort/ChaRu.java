package com.example.study_demo.sort;

import java.util.Arrays;

public class ChaRu {
    public static void main(String[] args) {

        int[] sort = sort(new int[]{12, 6, 23, 6, 5, 3, 1});

        System.out.println(Arrays.toString(sort));

    }



    public static int[] sort(int[] arr){

        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
        return arr;
    }
}
