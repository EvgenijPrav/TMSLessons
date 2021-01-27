package com.company.less17;

public class MyClass {

    private static volatile MyClass instance;

    public static MyClass getInstance() {
        MyClass localInstance = instance;
        if (localInstance == null) {
            synchronized (MyClass.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new MyClass();
                }
            }
        }
        return localInstance;
    }
}
