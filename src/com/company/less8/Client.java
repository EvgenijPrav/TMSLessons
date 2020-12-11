package com.company.less8;

public class Client extends Person{

    private String company;

    public Client(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void display() {
        System.out.println("This is " + getName() + " and he/she is a client of " + company);
    }

    @Override
    protected int getNumber() {
        System.out.println("Reading from the local file");
        return 0;
    }
}
