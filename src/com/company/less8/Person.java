package com.company.less8;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void doSomething() {
        int n = getNumber();
        System.out.println(n);
    }

    public abstract void display();

    protected abstract int getNumber();
}
