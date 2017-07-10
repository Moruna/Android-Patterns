package com.moruna.mediatorpattern;

/**
 * Author: Moruna
 * Date: 2017-07-10
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteMediator extends Mediator {
    public ConcreteMediator(Colleague a, Colleague b) {
        super(a, b);
    }

    @Override
    void AaffectB() {
        B.setNum(A.getNum()/100);
    }

    @Override
    void BaffectA() {
        A.setNum(B.getNum()*100);
    }
}
