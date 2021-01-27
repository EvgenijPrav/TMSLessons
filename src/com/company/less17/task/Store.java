package com.company.less17.task;

public class Store {

    private int products;

    private static volatile Store instance;

    public static Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }
        return instance;
    }

    public static Store getInstance(String a) {
        Store localInstance = instance;
        if (localInstance == null) {
            synchronized (Store.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Store();
                }
            }
        }
        return localInstance;
    }

    private Store() {
    }

    public synchronized void get() {
        while (products < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products--;
        System.out.println("Покупатель купил 1 штуку товара из магазина " + toString());
        System.out.println("Товара на складе: " + products);
        notify();
    }

    public synchronized void put() {
        while (products >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products++;
        System.out.println("Поставщик добавил 1 штуку товара в магазин " + toString());
        System.out.println("Товара на складе: " + products);
        notify();
    }

    public synchronized void check() {
        while (products >= 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products++;
        System.out.println("Завскладом добавил 1 штуку товара в магазин " + toString());
        System.out.println("Товара на складе: " + products);
        notify();
    }
}
