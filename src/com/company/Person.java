package com.company;

import java.util.Random;

public class Person {

    int age;
    String name;

    private Random random = new Random();

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
        int randNum = random.nextInt();
        return age;
    }


    public void sayAge() {
        int anotherRand = random.nextInt();
        int i = 0;
        int k = 100;
        for(; i< 5; i++) {
            System.out.println(i);
            System.out.println(k);
        }
        i = 10;
        k = 100;
        System.out.println("My age is " + age);
    }

    public void sayName() {
        Random customRandom = new Random();
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
