package com.moruna.observerpattern;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-08
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class ConcreteSubject extends Subject {

    public static ConcreteSubject instance;
    private ConcreteSubject(){};
    public static ConcreteSubject getInstance(){
        if(instance == null){
            synchronized (ConcreteSubject.class){
                if(instance == null){
                    instance = new ConcreteSubject();
                }
            }
        }
        return instance;
    }
    @Override
    void doSomething() {
        Log.d("ObserverPattern", "被观察者发消息");
        notifyObserver();
    }
}
