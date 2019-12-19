package com.company;

public class Bank{
    private static Object key1 = new Object();
    public static void plus(){
        try {
            synchronized (key1){
                int m = (int)(Math.random()*500);
                Balance.b+=m;
                System.out.print("Остаток: ");
                System.out.println(Balance.b);
                System.out.print("Пополнено на счёт: ");
                System.out.println(m);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Object key2 = new Object();
    public static void minus(){
        try {
            synchronized (key2){
                int m = (int)(Math.random()*1000);
                if (m>Balance.b){
                    System.out.println("Недостаточно средств.");
                    Balance.falg = false;
                }
                else {
                    Balance.b -= m;
                    System.out.print("Остаток: ");
                    System.out.println(Balance.b);
                    System.out.print("Снято со счёта: ");
                    System.out.println(m);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
