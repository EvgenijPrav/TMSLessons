package com.company.less6;

import java.util.Random;

public class Lesson6 {

    private static PhoneNumber phoneNumber = new PhoneNumber("", "", "");

    public static void main(String[] args) {
//        lesson6Example();
//        staticExample();
        classReferences();
    }

    public static void lesson6Example() {
        Human human = new Human(25, "Andy", "Male", true, phoneNumber);
        Human human2 = new Human(52, "Ann", "Female", false, phoneNumber);
        System.out.println(human.getAge());
        System.out.println(human2.getAge());
    }

    public static void staticExample() {
        System.out.println(Human.getCounter());
        Human human = new Human(25, "Andy", "Male", true, phoneNumber);
        System.out.println(Human.getCounter());
        Human.say();
        System.out.println(Operation.multiply(4, 8));
        System.out.println(Operation.sum(5, 6));
    }

    public static void classReferences() {
        PhoneNumber phoneNumber = new PhoneNumber("1", "456", "45849227");
        Human human = new Human(25, "Andy", "Male", true, phoneNumber);
        changePersonAge(human);
        System.out.println(human.getAge());
        System.out.println(human.getPhoneNumber());
    }

    public static void changePersonAge(Human human) {
        human.setAge(new Random().nextInt(101));
    }
}
