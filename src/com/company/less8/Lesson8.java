package com.company.less8;

import com.company.less8.backcall.Button;
import com.company.less8.backcall.ButtonClickHandler;
import com.company.less8.backcall.EventHandler;
import com.company.less8.backcall.RingClickHandler;

public class Lesson8 {

    public static void main(String[] args) {
//        abstractClasses();
//        getFigureParams();
//        interfaces();
//        interfacesV2();
        backCall();
    }

    public static void abstractClasses() {
        Person sam = new Employee("Sam", "Oracle");
        Person bob = new Client("Bob", "Belinvestbank");
        sam.display();
        bob.display();
        getResult(sam);
        getResult(bob);
    }

    private static void getResult(Person person) {
        person.doSomething();
    }

    public static void getFigureParams() {
        Figure figure = new Rectangle(0.0f, 0.0f, 10, 54);
        System.out.println(figure.getPerimeter());
        System.out.println(figure.getArea());
    }

    public static void interfaces() {
        Book book = new Book("Java", "Shildt");
        book.print();
        book.testPrint();
        book.read();
        book.paint();
        Paintable.paintV2();
    }

    public static void interfacesV2() {
        Book book = new Book("Java", "Shildt");
        executeInterfaceMethod(book);
        book.read();
        if (book instanceof Book) {
            Printable realBook = (Book) book;
            realBook.testPrint();
        }
        Translator.Translatable translatableBook = new Book("Java", "Shildt");
        translatableBook.translate();
    }

    private static void executeInterfaceMethod(Readable readable) {
        readable.read();
    }

    public static void backCall() {
        EventHandler eventHandler = new RingClickHandler();
        Button b = new Button(new ButtonClickHandler());
        b.click();
        Button button = new Button(eventHandler);
        button.click();
        button.click();
        button.click();
        EventHandler handler = new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Processing from anonimys class");
            }
        };
        Button button1 = new Button(handler);
        button1.click();
    }

}
