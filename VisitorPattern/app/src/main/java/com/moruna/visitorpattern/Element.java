package com.moruna.visitorpattern;

/**
 * Author: Moruna
 * Date: 2017-07-13
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public interface Element {
    void printStr();

    void accept(IVisitor visitor);
}
