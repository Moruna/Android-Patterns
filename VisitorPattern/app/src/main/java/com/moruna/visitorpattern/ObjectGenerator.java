package com.moruna.visitorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Moruna
 * Date: 2017-07-13
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ObjectGenerator {
    public static List<Element> getList() {
        List<Element> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(new ConcreteElementA());
            list.add(new ConcreteElementB());
        }
        return list;
    }
}
