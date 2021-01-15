package com.company.less15;

import com.company.less9.bookshelf.Book;

import java.time.*;
import java.util.Random;
import java.util.Scanner;

public class Lesson15 {

    public static void main(String[] args) {
//        workWithDates();
//        workWithTime();
//        workWithDateTime();
//        carTestRunner();
//        predicates();
//        binaryAndUnaryOperators();
//        mappers();
//        consumers();
        supplier();
    }

    private static void workWithDates() {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specifiedDate = LocalDate.of(2021, Month.FEBRUARY, 17);
        System.out.println(specifiedDate);

        LocalDate dateFromEpoch = LocalDate.ofEpochDay(15_000);
        System.out.println(dateFromEpoch);

        LocalDate dateFromYear = LocalDate.ofYearDay(2021, 366);
        System.out.println(dateFromYear);
    }

    private static void workWithTime() {
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalTime timeOfDay = LocalTime.of(17, 34, 56);
        System.out.println(timeOfDay);

        LocalTime timeFromStart = LocalTime.ofSecondOfDay(10000);
        System.out.println(timeFromStart);
    }

    private static void workWithDateTime() {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime todayV2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(todayV2);

        LocalDateTime randomDate = LocalDateTime.of(1934, 12, 23, 12, 45);
        System.out.println(randomDate);

        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(-2_000_000_000, 0, ZoneOffset.UTC);
        System.out.println(dateFromBase);
        System.out.println(dateFromBase.withYear(2011));
    }

    private static void printTest(Car car, CheckCar checkCar) {
        if (checkCar.test(car)) {
            System.out.println(car);
        }
    }

    private static void carTestRunner() {
        Car car1 = new Car("Car1", true, true);
        Car car2 = new Car("Car2", false, true);

        printTest(car1, new CheckCar() {
            @Override
            public boolean test(Car car) {
                return false;
            }
        });

        printTest(car1, abc -> abc.isFullDrive());
        printTest(car1, c -> c.isGasEngine());
        printTest(car2, c -> c.isFullDrive());
        printTest(car2, c -> c.isGasEngine());

        printTest(car2, c -> {
            boolean costAcceptable = true;
            return c.isGasEngine() && c.isFullDrive() && costAcceptable;
        });
    }

    private static void predicates() {
        Predicate<Integer> isPositive = (value) -> value > 0;
        System.out.println(isPositive.isValueAcceptable(5));
        System.out.println(isPositive.isValueAcceptable(-5));
        System.out.println("*************");

        Predicate<String> isNotEmptyPredicate = value -> {
            return value.length() > 0;
        };
        System.out.println(isNotEmptyPredicate.isValueAcceptable("Hello"));
        System.out.println(isNotEmptyPredicate.isValueAcceptable(""));
    }

    private static void binaryAndUnaryOperators() {
        int multiplier = 6;
        BinaryOperator<Integer> multiplyOperator = (x, y) -> x * y * multiplier;
        System.out.println(multiplyOperator.apply(12, 5));
        System.out.println("**************");

        UnaryOperator<String> trimOperator = value -> value.trim();
        System.out.println(trimOperator.apply("           Java 8        "));
        UnaryOperator<String> substringOperator = value -> {
            if (value.length() >= 5) {
                return value.substring(0, 5);
            }
            return value;
        };
        System.out.println(substringOperator.apply("Java"));
        System.out.println(substringOperator.apply("JavaJavaJava"));
    }

    private static void mappers() {
        Function1<String, Double> mapper0 = Double::parseDouble;
        Function1<String, Double> mapper1 = str -> Double.parseDouble(str);
        double d = mapper1.apply("123.6");
        System.out.println(d);
        Function2<String, Boolean, Double> mapper2 = (str, b) -> {
            if (b) {
                return Double.parseDouble(str);
            } else {
                return Double.parseDouble(str) * (-1);
            }
        };
        double value1 = mapper2.apply("456", true);
        double value2 = mapper2.apply("456", false);
        System.out.println("************************");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println("************************");

        Function1<String, Double> mapper = new Mapper();
        double d2 = mapper.apply("765");
        System.out.println(d2);
    }

    private static void consumers() {
        Consumer<Integer> printer = x -> {
            System.out.println("В газете " + Math.abs(x) + " страниц");
        };
        printer.accept(5);
        printer.accept(-13);
    }

    private static void supplier() {
        Supplier<Integer> numberSupplier = () -> {
            Random random = new Random();
            return random.nextInt();
        };
        System.out.println(numberSupplier.get());
        Supplier<String> stringSupplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Post name");
            return scanner.nextLine();
        };
        System.out.println("My name is " + stringSupplier.get());
    }

    private static void test() {
        Function2<String, Integer, Boolean> function2 = Lesson15::something;
    }

    private static Boolean something(String s, Integer i) {
        return false;
    }
}
