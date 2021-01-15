package com.company.less15;

public class Mapper implements Function1<String, Double> {

    @Override
    public Double apply(String s) {
        return Double.parseDouble(s);
    }
}
