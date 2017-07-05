package com.moruna.abstractfactorypattern.toy;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-05
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class MenToy implements IToy {
    @Override
    public String getName() {
        Log.d("AbstractFactoryPattern","men toy");
        return "men toy";
    }
}
