package com.company.less7;

public class Math {

    private int anyNumber;

    // Nested static class (Вложенный статический класс)
    public static class Factorial {
        private int result;
        private int inputParam;
        public String name = "name";

        public Factorial(int x) {
            int result = 1;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            this.result = result;
            this.inputParam = x;
        }

        public int getResult() {
            return result;
        }

        public int getInputParam() {
            return inputParam;
        }
    }
}
