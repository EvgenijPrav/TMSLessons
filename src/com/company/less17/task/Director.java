package com.company.less17.task;

public class Director implements Runnable{

    private Store store;

    public Director(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.check();
        }
    }
}
