package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        arrays();
        sortArray();
    }

    public static void textInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scanner.nextLine();
        System.out.println("Posted string is " + str);
        scanner.close();
    }

    public static void hasNextCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please post a number");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a);
        } else {
            System.out.println("Not a number has been posted");
        }
        scanner.close();
    }

    public static void randomizeNumbers() {
        long seed = 10L;
        Random random = new Random(seed);
        for (int i = 0; i < 10; i++) {
            System.out.println("Random number is " + (random.nextInt()));
        }
    }

    public static void createSimpleArrays() {
        int[] abc = new int[10];
        System.out.println(Arrays.toString(abc));
        int[] array = {2, 56, 34, 100, 99, 34, 78};
        System.out.println(Arrays.toString(array));
    }

    public static void arrays() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please input myAwesomeArray length");
        int arrayLength = scanner.nextInt();
        System.out.println();
        int[] myAwesomeArray = new int[arrayLength];
        for (int i = 0; i < myAwesomeArray.length; i++) {
            myAwesomeArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(myAwesomeArray));

        int min = myAwesomeArray[0];
        int max = myAwesomeArray[0];

        for (int i = 0; i < myAwesomeArray.length; i++) {
            if (myAwesomeArray[i] < min) {
                min = myAwesomeArray[i];
            }
            if (myAwesomeArray[i] > max) {
                max = myAwesomeArray[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println();
        System.out.println();
        for (int i = myAwesomeArray.length - 1; i > 0; i--) {
            System.out.println("First cycle, step: " + i);
            for (int j = 0; j < i; j++) {
                System.out.println("Second cycle, step: " + j);
                if (myAwesomeArray[j] < myAwesomeArray[j + 1]) {
                    System.out.println("Swapping " + myAwesomeArray[j] + " and " + myAwesomeArray[j + 1]);
                    int temp = myAwesomeArray[j];
                    myAwesomeArray[j] = myAwesomeArray[j + 1];
                    myAwesomeArray[j + 1] = temp;
                }
                System.out.println("Second cycle, array:" + Arrays.toString(myAwesomeArray));
            }
        }
        System.out.println(Arrays.toString(myAwesomeArray));
    }

    public static void sortArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please input myAwesomeArray length");
        int arrayLength = scanner.nextInt();
        System.out.println();
        Integer[] myAwesomeArray = new Integer[arrayLength];
        for (int i = 0; i < myAwesomeArray.length; i++) {
            myAwesomeArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(myAwesomeArray));

        Integer[] array2 = Arrays.copyOf(myAwesomeArray, myAwesomeArray.length);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println(Arrays.toString(myAwesomeArray));
        System.out.println(Arrays.toString(array2));
    }
}
