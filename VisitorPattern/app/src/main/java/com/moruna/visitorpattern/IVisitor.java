package com.moruna.visitorpattern;

/**
 * Author: Moruna
 * Date: 2017-07-13
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public interface IVisitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}
