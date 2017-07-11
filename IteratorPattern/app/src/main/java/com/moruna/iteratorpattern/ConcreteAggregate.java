package com.moruna.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Moruna
 * Date: 2017-07-10
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
