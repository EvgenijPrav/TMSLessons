package com.company.less17;

import com.company.less17.task.Consumer;
import com.company.less17.task.Director;
import com.company.less17.task.Producer;
import com.company.less17.task.Store;

import java.util.Collections;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Lesson17 {

    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());
//        startCustomThread();
//        startDaemonThread();
//        startWithRunnable();
//        startWithRunnableAsLambda();
//        startNotSynchronized();
//        workWithTheStore();
        singleton();
    }

    private static void startCustomThread() {
        System.out.println("Main has been started");
        Thread t = new CustomThread("Custom");
        Thread t2 = new CustomThread("Custom2");
        t.start();
        t2.start();
        try {
            t.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread has been interrupted, " + t.getName());
        }
        System.out.println("Main thread has been finished");
    }

    private static void startDaemonThread() {
        System.out.println("Main has been started");
        Thread t = new CustomThread("Custom");
        t.start();
        t.interrupt();
        System.out.println("Main thread has been finished");
    }

    private static void startWithRunnable() {
        System.out.println("Main has been started");
        Runnable runnable = new CustomRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main thread has been finished");
    }

    private static void startWithRunnableAsLambda() {
        System.out.println("Main thread has been started");
        Runnable runnable = () -> {
            System.out.println("1Thread running, " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                System.out.println("1Thread finished, " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.err.println("1Thread has been interrupted");
            }
        };
        Thread thread00 = new Thread(runnable, "Thread777");
        Thread thread = new CustomThread(runnable, "Thread777");
        thread.start();
        System.out.println("Main thread has been finished");
    }

    private static void startNotSynchronized() {
        CommonRes commonRes = new CommonRes();
        for (int i = 0; i < 6; i++) {
            Thread thread = new Thread(new CountRunnable(commonRes));
            thread.setName("Thread " + i);
            thread.start();
        }
    }

    private static void workWithTheStore() {
        Runnable producerRunnable = () -> {
            Store store = Store.getInstance();
            Producer producer = new Producer(store);
            new Thread(producer).start();
        };
        Runnable consumerRunnable = () -> {
            Store store = Store.getInstance();
            Consumer consumer = new Consumer(store);
            new Thread(consumer).start();
        };
        Runnable directorRunnable = () -> {
            Store store = Store.getInstance();
            Director director = new Director(store);
            new Thread(director).start();
        };
        new Thread(producerRunnable).start();
        new Thread(consumerRunnable).start();
        new Thread(directorRunnable).start();
    }

    private static void singleton() {
        System.out.println("**********************");

        MyClass myClass1 = MyClass.getInstance();
        System.out.println(myClass1.toString());
        MyClass myClass2 = MyClass.getInstance();
        System.out.println(myClass2.toString());
        //Executors

        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ExecutorService ex = Executors.newFixedThreadPool(3);
        Callable<String> callable = () -> {
            Thread.sleep(3000);
            return "Finished";
        };

        Future<String> future = ex.submit(callable);
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        ex.shutdown();
    }
}
