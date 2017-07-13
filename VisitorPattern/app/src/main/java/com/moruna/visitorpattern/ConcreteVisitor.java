package com.moruna.visitorpattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-13
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteVisitor implements IVisitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        Log.d("VisitorPattern","visit elementA");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        Log.d("VisitorPattern","visit elementB");
    }
}
