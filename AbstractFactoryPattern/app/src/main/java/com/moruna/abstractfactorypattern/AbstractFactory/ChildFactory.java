package com.moruna.abstractfactorypattern.AbstractFactory;

import com.moruna.abstractfactorypattern.cloth.ChildCloth;
import com.moruna.abstractfactorypattern.cloth.ICloth;
import com.moruna.abstractfactorypattern.toy.ChildToy;
import com.moruna.abstractfactorypattern.toy.IToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ChildFactory implements IFactory {
    @Override
    public IToy createToy() {
        return new ChildToy();
    }

    @Override
    public ICloth createCloth() {
        return new ChildCloth();
    }
}
