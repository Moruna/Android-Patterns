package com.moruna.builderpattern;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class Director {
    Builder builder = new ConcreteBuilder();
    public Product getProductA(){
        builder.buildPart("马自达","CX-4");
        return builder.getProduct();
    }
    public Product getProductB(){
        builder.buildPart("马自达","阿特兹");
        return builder.getProduct();
    }
}
