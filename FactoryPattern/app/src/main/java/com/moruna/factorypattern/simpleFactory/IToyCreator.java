package com.moruna.factorypattern.simpleFactory;

import com.moruna.factorypattern.toy.IToy;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * * desc:只有一个实现的角色，根据不同的class参数生成不同产品对象
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public interface IToyCreator {
    <T extends IToy> IToy createToy(Class<T> clazz);
}
