package com.moruna.observerpattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        Log.d("ObserverPattern","观察者A收到消息");
    }
}
