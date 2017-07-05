package com.moruna.abstractfactorypattern.cloth;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class MenCloth implements ICloth {
    @Override
    public String getName() {
        Log.d("AbstractFactoryPattern","men cloth");
        return "men cloth";
    }
}
