package com.moruna.factorypattern.mutiFactory;

import com.moruna.factorypattern.toy.IToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * desc:有多个实现的角色
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public interface IToyCreator {
    IToy createToy();
}
