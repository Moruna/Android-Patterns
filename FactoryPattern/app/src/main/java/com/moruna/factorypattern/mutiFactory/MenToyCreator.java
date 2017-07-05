package com.moruna.factorypattern.mutiFactory;

import com.moruna.factorypattern.toy.IToy;
import com.moruna.factorypattern.toy.MenToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class MenToyCreator implements IToyCreator {
    @Override
    public IToy createToy() {
        IToy toy = new MenToy();
        toy.play();
        return toy;
    }
}
