package com.moruna.builderpattern;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public abstract class Builder {
    abstract void buildPart(String arg1, String arg2);
    abstract Product getProduct();
}
