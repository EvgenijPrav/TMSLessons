package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {
        kakUgodno();
    }

    public static void createSimpleArray() {
        System.out.println("Введите размер матрицы");
        Scanner sc;
        sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[][] mass = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                mass[i][j] = random.nextInt(20);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void German() {
        System.out.println("Hello, I'm German!");
    }

    public static void createArrayV2() {
        int[][] arr = new int[3][4];
        int[] ar = {2, 3};
        int[][] array = {
                {5, 6, 7, 8},
                {1, 4, 3, 2},
                {10, 100, 12, 3}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createArrayV3() {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mass = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMaxElement() {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(120);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] > max) {
                    max = mass[i][j];
                }
            }
        }
        System.out.println("Max value: " + max);
    }

    public static void showArrayLength() {
        int[][] mass = new int[36][45];
        System.out.println(mass.length);
        System.out.println(mass[0].length);
    }

    public static void printToString() {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(120);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mass[i]));
        }
    }

    public static void sumMainFirst() {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(120);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mass[i]));
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(mass[i][i]);
            sum += mass[i][i];
        }
        System.out.println(sum);
    }

    public static void printRange() {
        Random random = new Random();
        int n = random.nextInt(101) - 50;
        int i = -random.nextInt(51) - 50;
        System.out.println(i);

    }

    /*
    Ввести размер матрицы с клавиатуры, n строк != n столбцов;
    Заполнить матрицу рандомными числами от [-50; 50];
    Вывести матрицу на экран;
    Вывести все отрицательные элементы и их сумму.
     */
    public static void kakUgodno() {
        System.out.println("Введите количество строк");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101) - 50;
            }
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 0) {
                    System.out.print(array[i][j] + " ");
                    counter += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(counter);
    }
}
