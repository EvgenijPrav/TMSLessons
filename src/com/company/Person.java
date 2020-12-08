package com.company;

public class Person {

    int age;
    String name;

    public Person() {
        this(25, "Mary");
        System.out.println("Constructor without arguments has been called");
    }

    public Person(int age, String name) {
        System.out.println("Constructor with 2 arguments has been called");
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this(age, "Mary");
    }

    public Person(String name) {
        age = 30;
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void sayAge() {
        System.out.println("My age is " + age);
    }

    public void sayName() {
        System.out.println("My name is " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
