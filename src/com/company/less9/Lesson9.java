package com.company.less9;

import com.company.less9.bookshelf.Book;
import com.company.less9.bookshelf.BookType;
import com.company.less9.road.Car;
import com.company.less9.road.HighSpeedListener;
import com.company.less9.road.PoliceOffice;
import com.company.less9.road.Radar;

public class Lesson9 {

    public static void main(String[] args) {
//        sameMethodsInInterfaces();
//        enums();
//        enumMethods();
//        enumWithValues();
//        enumWithMethods();
//        printBookInfo();
        testRadar();
    }

    private static void sameMethodsInInterfaces() {
        Implementation implementation = new Implementation();
        System.out.println(implementation.getName());

        Inter1 inter1 = new Implementation();
        System.out.println(inter1.getName());

        Inter2 inter2 = new Implementation();
        System.out.println(inter2.getName(1));

        System.out.println(Inter1.NUMBER);
    }

    private static void enums() {
        Day current = Day.WEDNESDAY;
        System.out.println(current);

        final Book book = new Book("War and peace", "Tolstoy", BookType.SCIENCE);
        switch (book.getBookType()) {
            case SCIENCE:
                System.out.println("Science");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science-fiction");
                break;
            default:
                System.out.println("Not found");
        }
    }

    private static void enumMethods() {
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
        Day currentDay = Day.FRIDAY;
        System.out.println(currentDay.ordinal());
        Day day = Day.valueOf("WEDNESDAY");
        System.out.println(day);
        System.out.println(day.name());
        System.out.println(day.compareTo(Day.MONDAY));
        System.out.println(day.compareTo(Day.TUESDAY));
        System.out.println(day.compareTo(Day.WEDNESDAY));
        System.out.println(day.compareTo(Day.THURSDAY));
        System.out.println(day.compareTo(Day.FRIDAY));
    }

    private static void enumWithValues() {
        System.out.println(Color.RED.getColorHex());
        System.out.println(Color.GREEN.getColorHex());
        System.out.println(Color.BLUE.getColorHex());
    }

    private static void enumWithMethods() {
        Operation operation = Operation.SUM;
        System.out.println(operation.act(5, 4));
        operation = Operation.MULTIPLY;
        System.out.println(operation.act(5, 4));
    }

    private static void printBookInfo() {
        final Book book = new Book("War and peace", "Tolstoy", BookType.SCIENCE);
        System.out.println(book.toString());

        int rocketsCount = 5;

        //////
        for (int i = 0; i < 10; i++) {
            if (rocketsCount > 0) {
                System.out.println("Bang!");
                rocketsCount--;
            } else {
                System.out.println("Not enough rockets");
            }
        }

        if (rocketsCount > 0) {
            System.out.println("Bang!");
            rocketsCount--;
        }
    }

    private static void testRadar() {
        Car car = new Car("AB1265-7");
        car.setCurrentSpeed(100);

        HighSpeedListener listener = new PoliceOffice();
        Radar radar = new Radar(listener);
        radar.setMaxSpeed(100);
        radar.checkCarSpeed(car);
    }
}
