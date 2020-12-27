package com.company.less11;


import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.io.IOException;
import java.text.ParseException;
import java.util.Random;

public class Lesson11 {

    @NotNull
    private String name = "Abc";

    public static void main(String[] args) {
//        multipleCatchBlocks(0);
//        try {
//            throwExceptionByOurself();
//        } catch (Exception e) {
//            System.out.println("Exception has been thrown: " + e);
//        }
//        try {
//            throwExceptionByOurself();
//        } catch (IOException | IllegalAccessException e) {
//            System.out.println("Exception has been thrown: " + e);
//        }
//        showFinally();
//        getNumber();
//        workWithCoin();
//        throwCustomException();
        createStones();
        System.out.println("Hello");
        Lesson11 lesson11 = new Lesson11();

        if (lesson11.name != null)
        System.out.println(lesson11.name.length());
        getSmth();
    }

    private static Integer throwException() {
        try {
            int d = 3;
            int result = 42 / d;
            System.out.println("Division success");
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            return null;
        }
    }

    private static void multipleCatchBlocks(int variable) {
        try {
            int a = 1;
            System.out.println("a = " + variable);
            int b = 42 / variable;
            int[] c = {1};
            c[0] = 99;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by zero: " + arithmeticException);
            multipleCatchBlocks(1);
        } catch (Exception arrayIndexOutOfBoundsException) {
            System.out.println("array index invalid: " + arrayIndexOutOfBoundsException);
        }
    }

    private static void throwExceptionByOurself() throws IOException, IllegalAccessException {
        try {
            //
            //
            //
            if (false) {
                throw new IllegalAccessException("Demo exception");
            } else {
                throw new IOException("IO ex");
            }
        } catch (IOException e) {
            System.out.println("Inside method");
            throw e;
        }
    }

    private static void showFinally() {
        try {
            procA();
        } catch (Exception e) {
        }
        procB();

    }

    private static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("DemoA");
        } finally {
            System.out.println("procA finally");
        }
    }

    private static void procB() {
        try {
            System.out.println("inside procB");
            throw new RuntimeException("DemoB");
        } finally {
            System.out.println("procB finally");
        }
    }

    private static void getNumber() {
        try {
            int randomInt = new Random().nextInt(2);
            if (randomInt == 0) {
                throw new IllegalArgumentException("Random int is zero");
            }
            System.out.println(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println(0);
        } finally {
            System.out.println(2);
        }
    }

    private static void workWithCoin() {
        try {
            createCoin("1s");
        } catch (CoinTechnicalException e) {
            Throwable throwable = e.getCause();
            System.out.println("Original exception: " + e);
            System.out.println("Original exception details: " + e.getMessage());
            if (throwable != null) {
                System.out.println("Nested exception: " + throwable);
                System.out.println("Nested exception details: " + throwable.getMessage());
            }
        }
    }

    private static void createCoin(@Nullable String diameter) throws CoinTechnicalException {
        Coin coin = new Coin();
        try {
            double d = Double.parseDouble(diameter);
            coin.setDiameter(d);
        } catch (NumberFormatException | NullPointerException numberFormatException) {
            throw new CoinTechnicalException(diameter, numberFormatException);
        } catch (CoinLogicException e) {
            e.printStackTrace();
        }
    }

    private static void throwCustomException() {
        try {
            compute(9);
            compute(11);
        } catch (MyException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    private static void compute(int a) throws MyException {
        System.out.println("Called with " + a);
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal exit");
    }

    private static void createStones() {
        Stone stone = new WhiteStone();
        WhiteStone whiteStone = new WhiteStone();
        Stone originalStone = new Stone();
        try {
            originalStone.build("");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            stone.build("");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        whiteStone.build("");
    }

    private static int getSmth() {
        System.out.println("Method with 0 arguments");
        return 0;
    }

    private static int getSmth(String s) {
        System.out.println("Method with 1 argument: " + s.getClass());
        return 1;
    }

    private static int getSmth(Integer i) {
        System.out.println("Method with 1 argument: " + i.getClass());
        return 1;
    }

    private static int getSmth(String s, Integer i) {
        System.out.println("Method with 2 arguments: " + s.getClass() + " " + i.getClass());
        return 2;
    }
}
