package com.company.less8;

public class Employee extends Person {

    private String company;
    private int getNameCounter;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public int getGetNameCounter() {
        return getNameCounter;
    }

    @Override
    protected String getName() {
        getNameCounter++;
        return super.getName();
    }

    @Override
    public void display() {
        System.out.println("This is " + super.getName() + " and works for " + company);
    }

    @Override
    protected int getNumber() {
        System.out.println("Performing network call");
        return 100;
    }
}
