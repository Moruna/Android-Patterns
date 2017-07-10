package com.moruna.mediatorpattern;

/**
 * Author: Moruna
 * Date: 2017-07-10
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public abstract class Mediator {

    protected Colleague A = new ConcreteColleagueA();
    protected Colleague B = new ConcreteColleagueB();

    public Mediator(Colleague a, Colleague b) {
        A = a;
        B = b;
    }

    abstract void AaffectB();
    abstract void BaffectA();
}
