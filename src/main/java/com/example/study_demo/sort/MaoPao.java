package com.example.study_demo.sort;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {

        int[] sort = sort(new int[]{12, 6, 23, 6, 5, 3, 1});

        System.out.println(Arrays.toString(sort));

    }



    public static int[] sort(int[] arr){

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
