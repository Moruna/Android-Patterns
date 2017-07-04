package com.moruna.templatepattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-04
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class XmlFormatter extends Formatter {
    @Override
    protected String format(Book book) {
        String result = "";
        result += "<book_name>" + book.getBookName() + "</book_name>\n";
        result += "<pages>" + book.getPages() + "</pages>\n";
        result += "<price>" + book.getPrice() + "</price>\n";
        result += "<author>" + book.getAuthor() + "</author>\n";
        Log.d("TemplatePatternTest", "xml-result=" + result);
        return result;
    }
}
