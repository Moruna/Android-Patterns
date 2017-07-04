package com.moruna.strategypattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-04
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class StrategyDefault implements Strategy {
    @Override
    public void run() {
        Log.d("StrategyPatternTest","run-StrategyDefault");
    }
}
