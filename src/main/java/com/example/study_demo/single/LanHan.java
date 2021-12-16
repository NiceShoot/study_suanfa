package com.example.study_demo.single;

public class LanHan {


    private static LanHan str;

    public LanHan() {
    }

    public static LanHan getInstance(){

        if (str == null){
            str = new LanHan();
        }
        return str;
    }

}
