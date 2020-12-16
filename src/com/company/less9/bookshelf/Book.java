package com.company.less9.bookshelf;

import com.sun.istack.internal.NotNull;

import java.util.Random;

public class Book {
    private final String name;
    private final String author;
    private final BookType bookType;
    private int uuid;

    public Book(final String name, final String author, final BookType bookType) {
        this.author = author;
        this.bookType = bookType;
        this.name = name;
    }

    @NotNull
    public BookType getBookType() {
        return bookType;
    }

    public void saveBook() {
        generateUuid();
        booksaver(this, uuid);
    }

    private int generateUuid() {
        uuid = new Random().nextInt();
        return uuid;
    }

    public int getUuid() {
        uuid = new Random().nextInt();
        return uuid;
    }

    @Override
    public String toString() {
        return "Name: " + name + ",\n" + "Author: " + author + ",\n" + "Book type: " + bookType + ".";
    }


    private void booksaver(Book book, int id) {

    }
}
