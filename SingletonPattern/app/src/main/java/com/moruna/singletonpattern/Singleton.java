package com.moruna.singletonpattern;

/**
 * Author: Moruna
 * Date: 2017-07-04
 * Copyright (c) 2017,dudu Co.,Ltd. All rights reserved.
 */
public class Singleton {
    private String name;

    public String getName() {
        return name;
    }
    //懒汉-thread-unsafety
//    private static Singleton instance = null;
//
//    private Singleton() {
//        name = "懒汉-thread-unsafety";
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //懒汉-thread-safety
    private static Singleton instance = null;
    private Singleton(){
        name = "懒汉-thread-safety";
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //饿汉1-thread-safety
//    private static Singleton instance = new Singleton();
//    private Singleton(){
//        name = "饿汉1-thread-safety";
//    }
//    public static Singleton getInstance(){
//        return instance;
//    }

    //饿汉2-thread-safety
//    private static Singleton instance = null;
//    private Singleton() {
//        name = "饿汉2-thread-safety";
//    }
//    public static Singleton getInstance() {
//        return instance;
//    }
//    static {
//        instance = new Singleton();
//    }

    //静态内部类-thread-safety
//    private static class SingletonHolder {
//        private static Singleton instance = new Singleton();
//    }
//
//    private Singleton() {
//        name = "static inner class";
//    }
//
//    public static Singleton getInstance() {
//        return SingletonHolder.instance;
//    }

    //枚举-thread-safety，android不推荐使用，often require more than twice as much memory as static constants
    enum SingletonEnum {
        INSTANCE("enum singleton thread-safety");
        private String name;

        SingletonEnum(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
