package com.company;

public class Lesson2 {

    public static void main(String[] args) {
        int first = 99;
        int anotherVariable = 100;
        int maxValue = getMaxNumber(first, anotherVariable);
        System.out.println(maxValue);
        System.out.println(getHello());
        sayHello();
        String name = "Alex";
        System.out.println(greetPerson(name));
        Integer integer = 0;
        intTest(integer);
        System.out.println(integer);
    }


    public static int getMaxNumber(int first, int second) {
        System.out.println("getMaxNumber method");
        int maxValue = Math.max(first, second);
        return maxValue;
    }

    public static String getHello() {
        return "Hello";
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static String greetPerson(String name) {
        return "Hello " + name;
    }

    public static int getCount(String word) {
        int count = word.length();
        return count;
    }

    public static void testMethod() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            count += i;
            if (count == 3) {
                return;
            }
        }
        //
        System.out.println("From the method: " + count);
    }

    public static void intTest(Integer variable) {
        variable++;
    }

    public static void forLoop() {
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Проход цикла: " + i);
            count += i;
            if (count == 10) {
                continue;
            }
            System.out.println("Extra output");
            if (count == 21) {
                break;
            }
            System.out.println("count " + count);
        }

        System.out.println(count);
        testMethod();
        System.out.println("Method is completed, finishing the app");
    }

}
