package com.company.less7;

import java.util.Objects;

public class Employee extends Human {
    private int salary;
    private String companyName;

    public Employee(int age, String name, int salary, String companyName) {
        super(age, name);
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("The person is " + getName() + " with age of " + getAge() +
                ", working at company " + companyName + " with salary of " + salary);
    }

    @Override
    public int getAge() {
        int age = super.getAge();
        System.out.println("I'm " + age);
        return age;
    }

    public void getEmployeeInfo() {
        System.out.println("Salary = " + salary + ", company name is " + companyName + ", name " + getName() + ", age = " + getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && companyName.equals(employee.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, companyName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
