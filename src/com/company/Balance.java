package com.company;

public class Balance extends Thread{
    public static int b;
    public static boolean falg = true;
    Balance(int b) {
        this.b = b;
    }
    @Override
    public void run(){
        while (falg){
            Bank.minus();
            if (falg == false){
                break;
            }
            Bank.plus();
        }
    }
}
