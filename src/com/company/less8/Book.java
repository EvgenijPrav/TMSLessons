package com.company.less8;

public class Book implements Paintable, Readable, Translator.Translatable {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Printing book " + name + " from " + author);
    }

    @Override
    public void testPrint() {
        System.out.println("testPrint method");
    }

    @Override
    public void read() {
        System.out.println("The book is being read");
    }

    @Override
    public void paint() {
        System.out.println("Painting the book");
    }

    @Override
    public void translate() {
        System.out.println("Translating the book: " + name);
    }
}
