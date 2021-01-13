package com.company.less14;

public class Printer {

    public <T> void print(T[] array) {
        for (T item: array) {
            System.out.println(item);
        }
    }

    public <T, R> T get(R value) {
        // some modifications around value
        return (T) value;
    }
}
