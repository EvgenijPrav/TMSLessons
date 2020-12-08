package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
//        arrays();
        stuffWithClasses1();
    }

    static void arrays() {
        long[][] array;
        int n;
        int m;
        boolean isFromNetwork = false;
        Scanner scanner = new Scanner(System.in);
        if (isFromNetwork) {
            n = getTwo();
            m = getTwo();
        } else {
            System.out.println("Введите размеры массива");
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
        array = new long[n][m];
        Random random = new Random();
        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextLong();
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int getTwo() {
        return 2;
    }

    public static void stuffWithClasses1() {
        com.company.Person person1 = new com.company.Person();
        person1.sayName();
        person1.sayAge();
        com.company.Person person2 = new com.company.Person(43, "Adam");
        person2.age = 76;
        person2.sayName();
        person2.sayAge();
        System.out.println(person1);
        System.out.println(person2);
    }
}
