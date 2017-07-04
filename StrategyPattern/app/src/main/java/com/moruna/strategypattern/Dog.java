package com.moruna.strategypattern;

/**
 * Author: Moruna
 * Date: 2017-07-04
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class Dog {
    private Strategy strategy;

    public Dog() {
        strategy = new StrategyDefault();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
    }
}
