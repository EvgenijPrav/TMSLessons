package com.company.less6;

public final class Human {

    private final int age;
    private final String name;
    private final String gender;
    private final boolean isMarried;
    private final PhoneNumber phoneNumber;

    private static int counter;

    static {
        counter = 10;
        System.out.println("Static block of initialization");
    }

    public Human(int age, String name, String gender, boolean isMarried, PhoneNumber phoneNumber) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.isMarried = isMarried;
        counter++;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int newAge) {
        System.out.println("This method is called with value equals to " + newAge);
        if (newAge > 0 && newAge <= 120) {
        } else {
            System.err.println("Invalid age: " + newAge);
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return "+" + phoneNumber.getCountryCode() + " " + phoneNumber.getOperatorCode() + " " + phoneNumber.getNumber();
    }

    public static void say() {
        System.out.println("Hello world");
    }

    public static int getCounter() {
        return counter;
    }
}
