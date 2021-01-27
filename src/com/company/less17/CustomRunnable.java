package com.company.less17;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread running, " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            System.out.println("Thread finished, " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.err.println("Thread has been interrupted");
        }
    }
}
