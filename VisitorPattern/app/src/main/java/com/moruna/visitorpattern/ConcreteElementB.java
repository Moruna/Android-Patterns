package com.moruna.visitorpattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-13
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteElementB implements Element {
    @Override
    public void printStr() {
        Log.d("VisitorPattern","I am ElementB");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
