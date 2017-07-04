package com.moruna.templatepattern;

/**
 * Author: Moruna
 * Date: 2017-07-04
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class Book {
    private String bookName;

    private int pages;

    private double price;

    private String author;

    private String isbn;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
