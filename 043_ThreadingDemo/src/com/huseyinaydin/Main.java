package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        KronometreThread kronometreThread1 = new KronometreThread("thread1");
        KronometreThread kronometreThread2 = new KronometreThread("thread2");
        KronometreThread kronometreThread3 = new KronometreThread("thread3");
        kronometreThread1.start();
        kronometreThread2.start();
        kronometreThread3.start();
    }
}
