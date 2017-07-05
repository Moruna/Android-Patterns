package com.moruna.abstractfactorypattern.AbstractFactory;

import com.moruna.abstractfactorypattern.cloth.ICloth;
import com.moruna.abstractfactorypattern.cloth.MenCloth;
import com.moruna.abstractfactorypattern.toy.IToy;
import com.moruna.abstractfactorypattern.toy.MenToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class MenFactory implements IFactory {
    @Override
    public IToy createToy() {
        return new MenToy();
    }

    @Override
    public ICloth createCloth() {
        return new MenCloth();
    }
}
