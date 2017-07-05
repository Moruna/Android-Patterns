package com.moruna.factorypattern.simpleFactory;

import com.moruna.factorypattern.toy.IToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteToyCreator implements IToyCreator {
    @Override
    public <T extends IToy> IToy createToy(Class<T> clazz) {
        if (clazz == null) {
            throw new IllegalArgumentException("argument is null");
        }
        try {
            IToy toy = clazz.newInstance();
            toy.play();
            return toy;
        } catch (Exception e) {
            throw new UnknownError(e.getMessage());
        }
    }
}
