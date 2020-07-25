package com.huseyinaydin;

public class KronometreThread implements Runnable {
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("çalıştırılıyor " + this.threadName);

        for (int i = 1; i <= 10; i++){
            System.out.println(this.threadName + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if (this.thread==null){
            this.thread = new Thread(this,this.threadName);
            this.thread.start();
        }
    }
}
