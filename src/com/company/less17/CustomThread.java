package com.company.less17;

public class CustomThread extends Thread {

    public CustomThread(String name) {
        super(name);
    }

    public CustomThread(Runnable runnable, String name) {
        super(runnable, name);
    }

    @Override
    public void run() {
        System.out.println("Thread running, " + Thread.currentThread().getName());
        if (!isInterrupted()) {
            System.out.println("Thread is NOT interrupted");
            try {
                Thread.sleep(1000);
                System.out.println("Thread finished, " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.err.println("Thread has been interrupted");
            }
        } else {
            System.out.println("Has been interrupted by user");
        }
    }
}
