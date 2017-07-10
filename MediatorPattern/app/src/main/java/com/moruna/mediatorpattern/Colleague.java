package com.moruna.mediatorpattern;

/**
 * Author: Moruna
 * Date: 2017-07-10
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public abstract class Colleague {
    protected int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    abstract void setNum(int num, Mediator mediator);
}
