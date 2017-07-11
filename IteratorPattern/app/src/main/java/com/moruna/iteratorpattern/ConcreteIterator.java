package com.moruna.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Moruna
 * Date: 2017-07-10
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteIterator implements Iterator {
    private List list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object object = null;
        if (this.hasNext()) {
            object = list.get(cursor++);
        }
        return object;
    }
}
