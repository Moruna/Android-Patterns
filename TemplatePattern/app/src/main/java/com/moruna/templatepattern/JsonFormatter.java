package com.moruna.templatepattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-04
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class JsonFormatter extends Formatter {
    @Override
    protected String format(Book book) {
        String result = "";
        result += "{\n";
        result += "\"book_name\" : \"" + book.getBookName() + "\",\n";
        result += "\"pages\" : \"" + book.getPages() + "\",\n";
        result += "\"price\" : \"" + book.getPrice() + "\",\n";
        result += "\"author\" : \"" + book.getAuthor() + "\",\n";
        result += "}";
        Log.d("TemplatePatternTest", "json-result=" + result);
        return result;
    }
}
