package com.moruna.factorypattern.toy;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ChildToy implements IToy {
    @Override
    public String getName() {
        return "car";
    }

    @Override
    public void play() {
        Log.d("FactoryPatternTest","child is playing car");
    }
}
