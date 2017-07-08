package com.moruna.builderpattern;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    @Override
    void buildPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    @Override
    Product getProduct() {
        return product;
    }
}
