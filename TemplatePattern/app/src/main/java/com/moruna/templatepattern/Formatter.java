package com.moruna.templatepattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-04
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public abstract class Formatter {
    public String formatBook(Book book) {
        beginFormat();
        String result = format(book);
        endFormat();
        return result;
    }

    private void beginFormat() {
        Log.d("TemplateFormatTest", "beginFormat");
    }

    protected abstract String format(Book book);

    private void endFormat() {
        Log.d("TemplateFormatTest", "endFormat");
    }
}
