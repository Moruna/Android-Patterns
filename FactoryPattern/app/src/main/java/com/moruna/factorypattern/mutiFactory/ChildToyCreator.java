package com.moruna.factorypattern.mutiFactory;

import com.moruna.factorypattern.toy.ChildToy;
import com.moruna.factorypattern.toy.IToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ChildToyCreator implements IToyCreator {
    @Override
    public IToy createToy() {
        IToy toy = new ChildToy();
        toy.play();
        return toy;
    }
}
