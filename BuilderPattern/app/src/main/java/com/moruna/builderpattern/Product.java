package com.moruna.builderpattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class Product {
    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showProduct() {
        Log.d("BuilderPattern", "name=" + name);
        Log.d("BuilderPattern", "type=" + type);
    }
}
