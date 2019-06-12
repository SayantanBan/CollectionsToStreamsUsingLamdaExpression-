package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread child");
            }
        };

        Thread t1 = new Thread(r);
        t1.start();
        System.out.println("Thread main");
    }
}
