package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // потоки:
        // extends Thread
        // implements Runnable
        // AsyncTask => doInBackground
        // анонимный класс
        //new MyThread("+").start();
        /*MyThread t1 = new MyThread("+");
        t1.start();
        MyThread t2 = new MyThread("-");
        t2.start();
        MyThread t3 = new MyThread("=");
        t3.start();
        Thread.sleep(3000);
        t1.flag = false;
        t1.join(); // ждёт полной остановки потока
        test("1-st stopped!");*/
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Balance balance = new Balance(a);
        balance.start();
        if (Balance.falg==false){
            balance.join();
        }
    }
    //private static Object key = new Object();
    /*public static void test (int m) {
        try {
            synchronized (key) {
                System.out.print("После снятия: ");
                Thread.sleep(1000);
                System.out.println(m);
                System.out.print("После пополнения: ");
                System.out.println(j);
                key.notify(); // возобновляет поток, которй попал в режим wait()
                key.wait(); // ждёт вызова метода notify()
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
