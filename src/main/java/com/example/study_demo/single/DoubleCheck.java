package com.example.study_demo.single;

public class DoubleCheck {

    private static volatile DoubleCheck instance;

    private DoubleCheck(){}

    public static DoubleCheck getInstance(){
        if (instance ==null){
            synchronized (DoubleCheck.class){
                instance = new DoubleCheck();
            }
        }
        return instance;
    }

}
