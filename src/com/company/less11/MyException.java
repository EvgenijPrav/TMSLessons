package com.company.less11;

public class MyException extends Exception {
    private final int detail;

    public MyException(int a) {
        detail = a;
    }

    public int getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
