package com.moruna.observerpattern;

import java.util.ArrayList;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Decs:被观察者，相当Observable
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        if(!observers.contains(o)) {
            observers.add(o);
        }
    }
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }
    protected void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }
    abstract void doSomething();
}
