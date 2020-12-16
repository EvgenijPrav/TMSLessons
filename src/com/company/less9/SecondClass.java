package com.company.less9;

public class SecondClass implements Inter1, Inter2{

    @Override
    public String getName() {
        return "SecondClass";
    }

    @Override
    public int getAge() {
        return 1;
    }

    @Override
    public String getName(int count) {
        return "SecondClass" + count;
    }

    @Override
    public void printData() {
        System.out.println("SecondClass printData");
    }
}
