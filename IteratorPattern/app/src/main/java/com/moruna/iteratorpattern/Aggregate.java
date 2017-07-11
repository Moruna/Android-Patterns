package com.moruna.iteratorpattern;

/**
 * Author: Moruna
 * Date: 2017-07-10
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public interface Aggregate {
    void add(Object object);

    void remove(Object object);

    Iterator iterator();
}
