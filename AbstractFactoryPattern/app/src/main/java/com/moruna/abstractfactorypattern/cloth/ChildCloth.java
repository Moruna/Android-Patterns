package com.moruna.abstractfactorypattern.cloth;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ChildCloth implements ICloth {
    @Override
    public String getName() {
        Log.d("AbstractFactoryPattern","child cloth");
        return "child cloth";
    }
}
