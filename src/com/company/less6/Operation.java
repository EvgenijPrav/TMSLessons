package com.company.less6;

public class Operation {

    private Operation() throws IllegalAccessException {
        throw new IllegalAccessException("Operation class cannot be created via constructor call");
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }
}
