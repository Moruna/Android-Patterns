package com.moruna.prototypepattern;

import java.util.ArrayList;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class Prototype implements Cloneable {
    private ArrayList list = new ArrayList();
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
            list = (ArrayList) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}
