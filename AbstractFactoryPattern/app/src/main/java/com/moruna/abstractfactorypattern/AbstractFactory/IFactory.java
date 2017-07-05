package com.moruna.abstractfactorypattern.AbstractFactory;

import com.moruna.abstractfactorypattern.cloth.ICloth;
import com.moruna.abstractfactorypattern.toy.IToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public interface IFactory {
    IToy createToy();

    ICloth createCloth();
}
