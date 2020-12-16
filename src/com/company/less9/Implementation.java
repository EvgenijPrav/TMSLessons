package com.company.less9;

public class Implementation implements Inter1, Inter2{

    static int COUNT = 0;

    @Override
    public String getName() {
        return "Name";
    }

    @Override
    public String getName(int count) {
        return null;
    }

    @Override
    public void printData() {
        System.out.println("Data");
    }

    @Override
    public int getAge() {
        return 0;
    }
}
