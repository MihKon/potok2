package com.company;

public class MyThread extends Thread{
    private int message;
    boolean flag = true;
    MyThread (int m){
        this.message = m;
    }
    @Override
    public void run(){
        while (flag){


        }
    }
}
