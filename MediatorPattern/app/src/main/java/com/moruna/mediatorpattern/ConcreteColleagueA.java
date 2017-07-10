package com.moruna.mediatorpattern;

/**
 * Author: Moruna
 * Date: 2017-07-10
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteColleagueA extends Colleague {
    @Override
    void setNum(int num, Mediator mediator) {
        this.num = num;
        mediator.AaffectB();
    }
}
