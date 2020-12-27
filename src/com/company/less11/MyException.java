package com.company.less11;

public class MyException extends Exception {
    private final int detail;

    public MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
